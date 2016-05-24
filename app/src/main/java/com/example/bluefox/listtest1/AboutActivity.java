package com.example.bluefox.listtest1;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewGroupCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*from here */
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_about, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
        TextView text = (TextView) findViewById(R.id.textText4);
        text.setText("This tour is dedicated to the memory of Professor C. Frank Brockman (1902-1985), who capped an influential, productive career in forestry and outdoor recreation by producing in 1980 the original University of Washington tree tour. Edited by Louise M. Hastie, that eight-page publication featured 81 campus trees, and had to be reprinted by popular demand. Along with the tour, Brockman authored five articles about campus trees for the U.W. Arboretum Bulletin. In 1968, the year he retired from the U.W. College of Forestry (now the School of Environmental and Forest Sciences), his best-selling &quot;Golden Guide&quot; to Trees of North America was released. Brockman&apos;s enthusiasm and love of sharing knowledge suggests he surely would welcome this new campus tree tour.                         \n" +
                "\n" +
                "App created by Jamy Southafeng and Omar Rojas as part of the 2016 iSchool Capstone for the School of Environmental and Forest Sciences. This app is free software licensed under the GNU GPL v3. Source code available at https://github.com/omar2112/fbtreetourapp. We hope you like this app, we spent a hundred hours on it :) ");
        /*tohere*/
    }

}

