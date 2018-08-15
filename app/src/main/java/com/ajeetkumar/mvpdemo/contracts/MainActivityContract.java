package com.ajeetkumar.mvpdemo.contracts;

/**
 * Created by ajeet on 8/3/2018.
 */
public interface MainActivityContract {

    interface View {
        void initView();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

}
