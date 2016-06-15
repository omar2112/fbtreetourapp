package com.fbtreetour.teamsonder.listtest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, List<String> values){
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout, parent, false);
        String theItem = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(position + 1 + ". " + theItem);
        return theView;
    }
}
