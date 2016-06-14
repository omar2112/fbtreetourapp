package com.example.bluefox.listtest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter2 extends ArrayAdapter<String> {

    public MyAdapter2(Context context, String[] values){
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);
        String theItem = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(theItem);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.theIcon);

        if (position == 0) {
            theImageView.setImageResource(R.drawable.home);
        } else if (position == 1) {
            theImageView.setImageResource(R.drawable.search);
        } else if (position == 2) {
            theImageView.setImageResource(R.drawable.navigation);
        } else {
            theImageView.setImageResource(R.drawable.about);
        }
        return theView;
    }
}
