package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Gallery_ahmedabad extends AppCompatActivity {
    RecyclerView recyclerView_ahmeedabad_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_ahmedabad);
        recyclerView_ahmeedabad_gallery = (RecyclerView) findViewById(R.id.rv_gallery_ahmedabad);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_ahmeedabad_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.ahmedabadimages());
        recyclerView_ahmeedabad_gallery.setAdapter(imageadapter);
    }}
