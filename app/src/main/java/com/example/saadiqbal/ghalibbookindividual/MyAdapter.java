package com.example.saadiqbal.ghalibbookindividual;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {

    private ArrayList<Item>  itemList = new ArrayList<>();

    Context context;
    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context,   textViewResourceId, objects);
        this.itemList = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        int count=itemList.size(); //counts the total number of elements from the arrayList.
        return count;//
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/mnw.ttf");
        convertView = inflater.inflate(R.layout.item_row, null);//set layout for displaying items
        TextView icon = (TextView) convertView.findViewById(R.id.textHeader);//get id for image view

        icon.setTypeface(typeface);
        icon.setText("" + itemList.get(position).index);
        if(itemList.get(position).getType())
        {

            icon.setGravity(Gravity.CENTER);
            icon.setTextColor(context.getResources().getColor(R.color.red));

        }
        else
        {
            icon.setGravity(Gravity.RIGHT);
            icon.setTextColor(context.getResources().getColor(R.color.black));
        }
        return convertView;}
}