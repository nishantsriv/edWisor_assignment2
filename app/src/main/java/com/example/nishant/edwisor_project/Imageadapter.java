package com.example.nishant.edwisor_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by nishant on 2/12/2017.
 */

public class Imageadapter extends RecyclerView.Adapter<Imageadapter.Imageholder> {
    private Context context;
    private ArrayList<Integer> images;
    private LayoutInflater inflator;

    public Imageadapter(Context context, ArrayList<Integer> getimages) {
        this.context = context;
        this.images = getimages;
        inflator = LayoutInflater.from(context);

    }


    @Override
    public Imageholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.image, parent, false);
        Imageholder holder = new Imageholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Imageholder holder, int position) {
holder.imageview.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class Imageholder extends RecyclerView.ViewHolder {
        ImageView imageview;

        public Imageholder(View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.imagecity);
        }
    }
}
