package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Famous_lucknow extends AppCompatActivity {
    RecyclerView recyclerView_famous_lucknow;
    FamousAdapter famousAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_lucknow);
        recyclerView_famous_lucknow = (RecyclerView) findViewById(R.id.rv_famous_lucknow);
        recyclerView_famous_lucknow.setLayoutManager(new LinearLayoutManager(this));
        famousAdapter= new FamousAdapter(this, Data.famous_lucknow());
        recyclerView_famous_lucknow.setAdapter(famousAdapter);

    }
}
