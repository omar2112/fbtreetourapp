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

public class AboutActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*from here */
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_about, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
        /*tohere*/
    }

}

