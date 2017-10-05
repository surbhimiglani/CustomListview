package com.example.surbhimiglani.customlistview;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;

class CustomAdapter extends ArrayAdapter<String> {


    CustomAdapter(Context context, String[] foods) {
        super(context,R.layout.newlayout,foods);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myinflator=LayoutInflater.from(getContext());
        View customView=myinflator.inflate(R.layout.newlayout,parent,false);

        String fooditem=getItem(position);
        TextView textView=(TextView) customView.findViewById(R.id.textView);
        ImageView imageView=(ImageView) customView.findViewById(R.id.imageView);


        textView.setText(fooditem);
        imageView.setImageResource(R.drawable.g);
        return customView;


    }
}
