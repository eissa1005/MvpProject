package com.example.samirsalah.mvpproject.ui.screens;

import android.content.Context;



/**
 * Created by samir salah on 8/13/2017.
 */

public class MainPresenter<T> {


    public T view;

    public void attachView(T view){
        this.view = view;
    }


    public boolean isDetachView(){
        return view ==null;
    }


    public void detachView(){
        view = null;
    }

//    public boolean isInternetAvailable(){
//        return AppUtils.isInternetAvailable(RetrofitApp.getAppContext());
//    }

    public Context getContext(){
        return RetrofitApp.getAppContext();
    }
}

