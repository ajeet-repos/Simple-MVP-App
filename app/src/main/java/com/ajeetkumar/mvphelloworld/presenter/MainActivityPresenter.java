package com.ajeetkumar.mvphelloworld.presenter;

import android.view.View;

import com.ajeetkumar.mvphelloworld.contracts.MainActivityContract;
import com.ajeetkumar.mvphelloworld.models.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View v) {
        mView = v;

        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        Integer data = mModel.getData();
        mView.setViewData(data.toString());
    }
}
