package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Delhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
    }

    public void gallery(View view) {
        Intent intent = new Intent(this, Gallery_delhi.class);
        startActivity(intent);
    }

    public void fplace(View view) {
        Intent intent = new Intent(this, Famous_delhi.class);
        startActivity(intent);
    }
}
