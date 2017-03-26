package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Gallery_mumbai extends AppCompatActivity {
    RecyclerView recyclerView_mumbai_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_mumbai);
        recyclerView_mumbai_gallery = (RecyclerView) findViewById(R.id.rv_gallery_mumbai);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_mumbai_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.mumbaiimages());
        recyclerView_mumbai_gallery.setAdapter(imageadapter);
    }
}
