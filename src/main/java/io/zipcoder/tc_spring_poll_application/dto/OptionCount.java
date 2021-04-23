package io.zipcoder.tc_spring_poll_application.dto;

import io.zipcoder.tc_spring_poll_application.domain.Option;

public class OptionCount {
    private Long optionId;
    private int count;

    public OptionCount(Long optionId, int count) {
        this.optionId = optionId;
        this.count = count;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increaseCount () {
        this.count++;
    }
}