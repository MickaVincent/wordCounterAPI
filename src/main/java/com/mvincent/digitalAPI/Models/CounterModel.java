package com.mvincent.digitalAPI.Models;

import org.springframework.data.annotation.Id;


public class CounterModel {

    @Id
    public String id;

    public int keywordCounter;

    public CounterModel() {}

    public CounterModel(String keyword) {
        this.id = keyword;
        this.keywordCounter = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, counter='%s']",
                id, keywordCounter);
    }


}

