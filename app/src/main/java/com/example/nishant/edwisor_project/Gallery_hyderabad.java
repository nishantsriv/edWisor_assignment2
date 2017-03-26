package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Gallery_hyderabad extends AppCompatActivity {
    RecyclerView recyclerView_hyderabad_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_hyderabad);
        recyclerView_hyderabad_gallery = (RecyclerView) findViewById(R.id.rv_gallery_hyderabad);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_hyderabad_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.hyderabadimages());
        recyclerView_hyderabad_gallery.setAdapter(imageadapter);
    }
}
