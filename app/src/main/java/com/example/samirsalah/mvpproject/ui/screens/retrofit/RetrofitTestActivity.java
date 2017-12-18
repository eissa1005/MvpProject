package com.example.samirsalah.mvpproject.ui.screens.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.samirsalah.mvpproject.R;

public class RetrofitTestActivity extends AppCompatActivity implements RetrofitView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_test);

    }

    @Override
    public void update() {

    }
}
