package com.example.nishant.edwisor_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

;import java.util.ArrayList;

public class View extends AppCompatActivity {
    private SharedPreferences prefrences;
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        prefrences = getSharedPreferences("LoginPrefrences", MODE_PRIVATE);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }

    @Override
    protected void onStart() {
        SharedPreferences preferences = getSharedPreferences("pref", MODE_PRIVATE);
        String a = preferences.getString("title", "null");

        /*Add*/
        Citylist citylist = new Citylist();
        citylist.setImageid(R.mipmap.ic_launcher);
        citylist.setTitle(a);
        adapter = new Adapter(this, getdata(citylist));
        recyclerView.setAdapter(adapter);
        super.onStart();
    }

    public static ArrayList<Citylist> getdata(Citylist list) {

        ArrayList<Citylist> data = new ArrayList<>();
        String[] name;
        int[] images;
        if (list.getTitle().equals("null")) {
            name = new String[]{"Delhi", " Mumbai", "Ahmedabad", "Lucknow",
                    "Hyderabad", "Bangalore", "Chennai", "Kolkata", "Plus"};
            images = new int[]{R.drawable.delhi,
                    R.drawable.mumbai, R.drawable.ahmedabad,
                    R.drawable.lucknow, R.drawable.hyderabad
                    , R.drawable.bangalore, R.drawable.chennai,
                    R.drawable.kolkata, R.drawable.plus};

        } else {
            name = new String[]{"Delhi", " Mumbai", "Ahmedabad", "Lucknow",
                    "Hyderabad", "Bangalore", "Chennai", "Kolkata", "Plus", list.getTitle()};
            images = new int[]{R.drawable.delhi,
                    R.drawable.mumbai, R.drawable.ahmedabad,
                    R.drawable.lucknow, R.drawable.hyderabad
                    , R.drawable.bangalore, R.drawable.chennai,
                    R.drawable.kolkata, R.drawable.plus, R.drawable.plus};

        }


        for (int i = 0; i < name.length; i++) {
            Citylist citylist = new Citylist();
            citylist.setTitle(name[i]);
            citylist.setImageid(images[i]);
            data.add(citylist);
        }
        return data;
    }

    public void logout(android.view.View view) {
        SharedPreferences.Editor editor = prefrences.edit();
        editor.clear().commit();
        Intent intent = new Intent(View.this, SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
