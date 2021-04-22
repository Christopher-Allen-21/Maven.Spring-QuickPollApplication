package io.zipcoder.tc_spring_poll_application.controllers;

import io.zipcoder.tc_spring_poll_application.OptionCount;
import io.zipcoder.tc_spring_poll_application.VoteResult;
import io.zipcoder.tc_spring_poll_application.domain.Vote;
import io.zipcoder.tc_spring_poll_application.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class ComputeResultController {

    private VoteRepository repository;

    @Autowired
    public ComputeResultController(VoteRepository repository){
        this.repository = repository;
    }

    //We inject an instance of VoteRepository into the controller, which is used to retrieve votes for a given poll.
    //The computeResult method takes pollId as its parameter.
    //The @RequestParam annotation instructs Spring to retrieve the pollId value from a HTTP query parameter.
    //The computed results are sent to the client using a newly created instance of ResponseEntity.
    @GetMapping("/computeResult/{pollId}")
    public ResponseEntity<?> computeResult(@PathVariable Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = repository.findVotesByPoll(pollId);

        //TODO: Implement algorithm to count votes
        voteResult.setResults(new ArrayList<OptionCount>());
        Collection<OptionCount> optionCountList = voteResult.getResults();
        for(Vote v: allVotes){
            if(optionCountList.isEmpty()){
                OptionCount optionCount = new OptionCount(v.getOption().getId());
                optionCountList.add(optionCount);
            }
            else{
                boolean isPresent = false;
                for(OptionCount oc : optionCountList){
                    //check if option id already in OptionCountList
                    if(oc.getOptionId() == v.getOption().getId()){
                        oc.incrementOptionId();
                        isPresent = true;
                    }
                }
                if(!isPresent){
                    OptionCount optionCount = new OptionCount(v.getOption().getId());
                    optionCountList.add(optionCount);
                }
            }
            voteResult.incrementVotes();
        }

        voteResult.setResults(optionCountList);
        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }
}
