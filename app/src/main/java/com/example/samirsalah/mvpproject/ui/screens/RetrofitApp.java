package com.example.samirsalah.mvpproject.ui.screens;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;


/**
 * Created by samir salah on 8/14/2017.
 */

public class RetrofitApp extends Application {

    private static Context appContext;


    public static RetrofitApp get(Context context) {
        return (RetrofitApp) context.getApplicationContext();
    }


//    private ApiService mApiService;
    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
//        // initialize debug.
//        Timber.plant(new Timber.DebugTree());
//
//
//        ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
//                .contextModule(new ContextModule(this))
//                .build();
//
//        mApiService = applicationComponent.getService();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //  AppUtils.setAppLanguage(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
//        MultiDex.install(this);
    }


    public static Context getAppContext() {
        return appContext;
    }

//    public ApiService getApiService(){
//        return mApiService;
//    }


}
