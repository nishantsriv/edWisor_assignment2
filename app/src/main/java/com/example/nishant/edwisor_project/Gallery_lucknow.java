package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Gallery_lucknow extends AppCompatActivity {
    RecyclerView recyclerView_lucknow_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_lucknow);
        recyclerView_lucknow_gallery = (RecyclerView) findViewById(R.id.rv_gallery_lucknow);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_lucknow_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.lucknowimages());
        recyclerView_lucknow_gallery.setAdapter(imageadapter);
    }
}
