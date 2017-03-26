package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Handler handler;
    private SharedPreferences prefrences;
    private boolean loginstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sharedprefs initialisation//
        prefrences = getSharedPreferences("LoginPrefrences", MODE_PRIVATE);
        loginstatus = prefrences.getBoolean("Login", false);
        if (loginstatus) {
            citylist();
            return;
        } else {
            handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    loginpage();
                }
            }, 1000);
        }
    }

    private void loginpage() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();

    }

    private void citylist() {
        Intent intent = new Intent(MainActivity.this, View.class);
        startActivity(intent);
        finish();

    }
}
