package com.example.bluefox.listtest1;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchInDirectory extends MainActivity {

    private ListView theListView;
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> treeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_treeinfo, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);


        theListView = (ListView) findViewById(R.id.theListView);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        String[] treeDir = new String[] {"Monterey Pine", "European Larch", "Yoshino Cherry", "Cedar of Lebanon",
                "Hybrid Holly", "Atlas Cedar", "Lombardy Poplar", "Cherry Plum", "Hybrid Planetrees/Sycamore",
                "Deodar Cedar", "Evergreen Magnolia", "Crab Apple Trees"};

        adapter = new ArrayAdapter<String> (this, R.layout.list_item, R.id.product_name, treeDir);
        theListView.setAdapter(adapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String)theListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You have selected " + itemValue , Toast.LENGTH_SHORT).show();
                Intent nextActivity = new Intent(SearchInDirectory.this, TreeInformation.class);
                nextActivity.putExtra("trees", itemValue);
                startActivity(nextActivity);
            }
        });

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                SearchInDirectory.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });


    }

}




