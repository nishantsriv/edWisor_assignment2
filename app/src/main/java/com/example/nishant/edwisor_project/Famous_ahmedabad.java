package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Famous_ahmedabad extends AppCompatActivity {
    RecyclerView recyclerView_famous_ahmedabad;
    FamousAdapter famousAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_ahmedabad);
        recyclerView_famous_ahmedabad= (RecyclerView) findViewById(R.id.rv_famous_ahmedabad);
        recyclerView_famous_ahmedabad.setLayoutManager(new LinearLayoutManager(this));
        famousAdapter= new FamousAdapter(this, Data.famous_ahmedabad());
        recyclerView_famous_ahmedabad.setAdapter(famousAdapter);

    }
}
