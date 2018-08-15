package com.ajeetkumar.mvpdemo.models;

import com.ajeetkumar.mvpdemo.contracts.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    private int counter = 0;

    @Override
    public String getData() {

        String msg = "Hello World! \n";
        if (counter == 0) {
            counter++;
        } else {
            msg += counter++;
        }

        return msg;
    }
}
