package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Gallery_bangalore extends AppCompatActivity {
    RecyclerView recyclerView_bangalore_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_bangalore);
        recyclerView_bangalore_gallery = (RecyclerView) findViewById(R.id.rv_gallery_bangalore);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_bangalore_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.bangaloreimages());
        recyclerView_bangalore_gallery.setAdapter(imageadapter);
    }
}
