package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Lucknow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucknow);
    }
    public void gallery(View view)
    {
        Intent intent=new Intent(this,Gallery_lucknow.class);
        startActivity(intent);
    }
    public void fplace(View view)
    {
        Intent intent=new Intent(this,Famous_lucknow.class);
        startActivity(intent);
    }
}
