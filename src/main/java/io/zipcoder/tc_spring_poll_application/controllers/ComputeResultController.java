package io.zipcoder.tc_spring_poll_application.controllers;

import io.zipcoder.tc_spring_poll_application.dto.OptionCount;
import io.zipcoder.tc_spring_poll_application.dto.VoteResult;
import io.zipcoder.tc_spring_poll_application.domain.Vote;
import io.zipcoder.tc_spring_poll_application.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

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
    @GetMapping("/polls/computeResult")
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = repository.findVotesByPoll(pollId);

        voteResult.setResults(new ArrayList<OptionCount>());
        Collection<OptionCount> list = voteResult.getResults();
        for (Vote vote : allVotes) {
            voteResult.incrementVotes();
        }

        for (Vote vote : allVotes) {
            if (list.isEmpty()) {
                OptionCount random = new OptionCount(vote.getOption().getId(), 0);
                list.add(random);
            }
            Long temp = vote.getOption().getId();
            boolean isPresent = true;
            for (OptionCount oc : list) {
                isPresent = false;
                if (oc.getOptionId().equals(temp)) {
                    oc.increaseCount();
                    isPresent = true;
                }
            }
            if (!isPresent) {
                OptionCount anotherOne = new OptionCount(vote.getOption().getId(), 0);
                list.add(anotherOne);
                anotherOne.increaseCount();
            }
        }

        voteResult.setResults(list);
        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }

}
