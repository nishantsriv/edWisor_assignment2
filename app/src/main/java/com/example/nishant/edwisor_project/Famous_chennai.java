package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Famous_chennai extends AppCompatActivity {
    RecyclerView recyclerView_famous_chennai;
    FamousAdapter famousAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_chennai);
        recyclerView_famous_chennai= (RecyclerView) findViewById(R.id.rv_famous_chennai);
        recyclerView_famous_chennai.setLayoutManager(new LinearLayoutManager(this));
        famousAdapter= new FamousAdapter(this, Data.famous_chennai());
        recyclerView_famous_chennai.setAdapter(famousAdapter);
    }
}
