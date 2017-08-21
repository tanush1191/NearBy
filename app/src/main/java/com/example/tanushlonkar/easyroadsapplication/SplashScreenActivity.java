package com.example.tanushlonkar.easyroadsapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
/**
 * Created by tanush.lonkar on 18-08-2017.
 */
public class SplashScreenActivity extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

