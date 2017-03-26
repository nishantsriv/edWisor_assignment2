package com.example.nishant.edwisor_project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nishant on 2/12/2017.
 */

public class FamousAdapter extends RecyclerView.Adapter<FamousAdapter.Holder> {
    private ArrayList<data_famous> data_famouses;
    private Context context;
    private LayoutInflater inflator;

    public FamousAdapter(Context context, ArrayList<data_famous> data_famouses) {
        this.context = context;
        this.data_famouses = data_famouses;
        inflator = LayoutInflater.from(context);
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.model, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.imageview.setImageResource(data_famouses.get(position).imageid);
        holder.textview.setText(data_famouses.get(position).stringid);
    }

    @Override
    public int getItemCount() {
        return data_famouses.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView textview;

        public Holder(View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.imageview);
            textview = (TextView) itemView.findViewById(R.id.tvcity);
        }
    }
}
