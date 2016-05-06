package com.example.bluefox.listtest1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class customTourActivity extends MainActivity {
/*
    private static customTourActivity tourInstance;
    public static customTourActivity getInstance() {
        return tourInstance;
    }
    //call this outside with customTourActivity.treeList
    public static List<String>treeList = new ArrayList<>();
*/


    /*
    private ListView mainMenuView;
    private ActionBarDrawerToggle mDrawerToggle;
    protected DrawerLayout mDrawerLayout;
    private String mActivityTitle;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_custom_tour);

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_custom_tour, null, false);
        mDrawerLayout.addView(contentView, 0);


        //super.onCreate(savedInstanceState);
        //tourInstance = this;
        //setContentView(R.layout.activity_custom_tour);
        //treeList.add("testing");
        String[] banana = new String[] {"apples", "oranges"};
        ListView theListView = (ListView)findViewById(R.id.customTour);


        ArrayAdapter<String> theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MainActivity.treeList);
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (MainActivity.treeList.get(position).equals("European Larch")) {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=47.651689, -122.308093&mode=w");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                } else if (MainActivity.treeList.get(position).equals("Monterey Pine")) {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=47.651556, -122.308437&mode=w");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }


            }
        });

    }
}
