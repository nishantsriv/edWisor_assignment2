package com.example.nishant.edwisor_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nishant on 2/11/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Cityviewholder> {

    private static int currentposition;
    private Context context;
    private ArrayList<Citylist> data;
    private LayoutInflater inflator;


    public Adapter(Context context, ArrayList<Citylist> data) {
        this.context = context;
        this.data = data;
        inflator = LayoutInflater.from(context);
    }



    @Override
    public Cityviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.model, parent, false);
        Cityviewholder holder = new Cityviewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Cityviewholder holder, final int position) {
        currentposition = position;
        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageid);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        Intent intent_delhi = new Intent(context, Delhi.class);
                        context.startActivity(intent_delhi);
                        break;
                    case 1:
                        Intent intent_mumbai = new Intent(context, Mumbai.class);
                        context.startActivity(intent_mumbai);
                        break;
                    case 2:
                        Intent intent_ahmedabad = new Intent(context, Ahmedabad.class);
                        context.startActivity(intent_ahmedabad);
                        break;
                    case 3:
                        Intent intent_lucknow = new Intent(context, Lucknow.class);
                        context.startActivity(intent_lucknow);
                        break;
                    case 4:
                        Intent intent_hyderabad = new Intent(context, Hyderabad.class);
                        context.startActivity(intent_hyderabad);
                        break;
                    case 5:
                        Intent intent_bangalore = new Intent(context, Bangalore.class);
                        context.startActivity(intent_bangalore);
                        break;
                    case 6:
                        Intent intent_chennai = new Intent(context, Chennai.class);
                        context.startActivity(intent_chennai);
                        break;
                    case 7:
                        Intent intent_kolkata = new Intent(context, Kolkata.class);
                        context.startActivity(intent_kolkata);
                        break;
                    case 8:
                        Intent intent_add_localplace = new Intent(context, Addnew.class);
                        context.startActivity(intent_add_localplace);

                        break;


                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static void addnew(String gettitle) {
        Citylist citylist = new Citylist();
        citylist.title = gettitle;
        citylist.imageid = R.mipmap.ic_launcher;
        Data.getdata().add(citylist);

    }


    public class Cityviewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public Cityviewholder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageview);
            textView = (TextView) itemView.findViewById(R.id.tvcity);
        }

    }
}
