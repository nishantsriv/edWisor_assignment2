package com.example.nishant.edwisor_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class  Gallery_kolkata extends AppCompatActivity {
    RecyclerView recyclerView_kolkata_gallery;
    Imageadapter imageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_kolkata);
        recyclerView_kolkata_gallery = (RecyclerView) findViewById(R.id.rv_gallery_kolkata);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_kolkata_gallery.setLayoutManager(linearLayoutManager);
        //
        imageadapter = new Imageadapter(this, GallerySore.kolkataimages());
        recyclerView_kolkata_gallery.setAdapter(imageadapter);
    }
}
