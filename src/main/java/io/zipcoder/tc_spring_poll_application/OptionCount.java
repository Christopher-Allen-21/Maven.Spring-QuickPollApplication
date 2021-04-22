package io.zipcoder.tc_spring_poll_application;

import io.zipcoder.tc_spring_poll_application.domain.Option;

public class OptionCount {

    private Long optionId;
    private int count;

    public OptionCount(Long optionId){
        this.optionId = optionId;
        this.count = 1;
    }

    public Long getOptionId(){
        return optionId;
    }

    public void setOptionId(Long optionId){
        this.optionId = optionId;
    }

    public void incrementOptionId(){
        this.optionId++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
