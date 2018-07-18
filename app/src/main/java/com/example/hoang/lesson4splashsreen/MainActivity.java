package com.example.hoang.lesson4splashsreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_SHOW_TIME = 5000;
    private static final int TIME_BROGRESSBAR = 100;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        startActivityByHandler();
    }

    private void startActivityByHandler() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressBar.setMax(TIME_BROGRESSBAR);
                Intent intent = new Intent(MainActivity.this, Manin2Activity.class);
                startActivity(intent);
            }
        }, SPLASH_SHOW_TIME);
    }

    private void init() {
        mProgressBar = findViewById(R.id.progessbar);
    }
}
