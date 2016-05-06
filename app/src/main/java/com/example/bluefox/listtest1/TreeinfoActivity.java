package com.example.bluefox.listtest1;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TreeinfoActivity extends MainActivity {
    ListView theListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_treeinfo, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);


        theListView = (ListView) findViewById(R.id.theListView);
        String[] treeDir = new String[] {"Monterey Pine", "European Larch", "Yoshino Cherry", "Cedar of Lebanon",
                "Hybrid Holly", "Atlas Cedar", "Lombardy Poplar", "Cherry Plum", "Hybrid Planetrees/Sycamore",
                "Deodar Cedar", "Evergreen Magnolia", "Crab Apple Trees"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, android.R.id.text1, treeDir);
        theListView.setAdapter(adapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String)theListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You have selected " + itemValue , Toast.LENGTH_SHORT).show();
                Intent nextActivity = new Intent(TreeinfoActivity.this, TreeInformation.class);
                nextActivity.putExtra("trees", itemValue);
                startActivity(nextActivity);
            }
        });
    }

/*                    ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, treeDir);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent changeScreen;
                if (i == 0) {
                    changeScreen = new Intent(view.getContext(), DeodarCedarActivity.class);
                } else if (i == 1) {
                    changeScreen = new Intent(view.getContext(), MontereyPineActivity.class);
                } else if (i == 2) {
                    changeScreen = new Intent(view.getContext(), EuropeanLarchActivity.class);
                } else {
                    changeScreen = new Intent(view.getContext(), DeodarCedarActivity.class);
                }
                startActivityForResult(changeScreen, 0);
            }
        });
        topic_name.setText("Default Title");
                    description.setText("Default Description");*/
}




