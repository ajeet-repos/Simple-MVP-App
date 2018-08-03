package com.ajeetkumar.mvphelloworld.models;

import com.ajeetkumar.mvphelloworld.contracts.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    private int counter = 0;

    @Override
    public String getData() {

        return "Hello World! - " + counter++;
    }
}
