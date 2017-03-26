package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Famous_kolkata extends AppCompatActivity {
    RecyclerView recyclerView_famous_kolkata;
    FamousAdapter famousAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_kolkata);
        recyclerView_famous_kolkata = (RecyclerView) findViewById(R.id.rv_famous_kolkata);
        recyclerView_famous_kolkata.setLayoutManager(new LinearLayoutManager(this));
        famousAdapter= new FamousAdapter(this, Data.famous_kolkata());
        recyclerView_famous_kolkata.setAdapter(famousAdapter);

    }
}
