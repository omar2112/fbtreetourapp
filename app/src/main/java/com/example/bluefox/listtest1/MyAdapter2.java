package com.example.bluefox.listtest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anyone on 3/16/15.
 */
// We can create custom adapters
class MyAdapter2 extends ArrayAdapter<String> {

    public MyAdapter2(Context context, String[] values){

        super(context, R.layout.row_layout, values);

    }

    // Override getView which is responsible for creating the rows for our list
    // position represents the index we are in for the array.

    // convertView is a reference to the previous view that is available for reuse. As
    // the user scrolls the information is populated as needed to conserve memory.

    // A ViewGroup are invisible containers that hold a bunch of views and
    // define their layout properties.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // The LayoutInflator puts a layout into the right View
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        // inflate takes the resource to load, the parent that the resource may be
        // loaded into and true or false if we are loading into a parent view.
        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);

        // We retrieve the text from the array
        String theItem = getItem(position);

        // Get the TextView we want to edit
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        // Put the next item into the TextView
        theTextView.setText(theItem);

        // Get the ImageView in the layout
        ImageView theImageView = (ImageView) theView.findViewById(R.id.theIcon);

        // We can set a ImageView like this
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
