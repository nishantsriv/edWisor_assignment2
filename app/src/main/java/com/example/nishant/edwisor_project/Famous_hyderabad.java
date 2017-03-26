package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Famous_hyderabad extends AppCompatActivity {
    RecyclerView recyclerView_famous_hyderabad;
    FamousAdapter famousAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_hyderabad);
        recyclerView_famous_hyderabad = (RecyclerView) findViewById(R.id.rv_famous_hyderabad);
        recyclerView_famous_hyderabad.setLayoutManager(new LinearLayoutManager(this));
        famousAdapter= new FamousAdapter(this, Data.famous_hyderabad());
        recyclerView_famous_hyderabad.setAdapter(famousAdapter);

    }
}
