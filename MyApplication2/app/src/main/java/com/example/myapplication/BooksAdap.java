package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksAdap extends RecyclerView.Adapter {

    ArrayList<Books> bArray;
    Context context;

    public BooksAdap(ArrayList<Books> bArray, Context context) {
        this.bArray = bArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connect to list
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list,parent,false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder)holder).rating.setText(bArray.get(position).getRating()+"");
        ((ViewHolder)holder).name.setText(bArray.get(position).getName()+"");
        ((ViewHolder)holder).catg.setText(bArray.get(position).getCatg()+"");
        ((ViewHolder)holder).writer.setText(bArray.get(position).getWriter()+"");
        ((ViewHolder)holder).img.setImageResource(bArray.get(position).getImg());


    }

    @Override
    public int getItemCount() {

        return bArray.size();//return how many books

    }

    // inner class

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //what i need to change
        public ImageView img;
        public TextView name;
        public TextView  catg;
        public TextView rating;
        public TextView writer;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;// مثل التوصيلة use find by id
            img = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.textView);
            catg = itemView.findViewById(R.id.textView2);
            rating= itemView.findViewById(R.id.textView3);
            writer = itemView.findViewById(R.id.textView4);

        }
    }
    {

    }
}




