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

public class TreeinfoActivity extends MainActivity {

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

        String[] treeDir = new String[] { "American White Elm", "Atlas Cedar",  "Bay Laurel",
                "Black Walnut", "Bristlecone Pine", "Bur Oak", "Cedar of Lebanon", "Cherry Plum",
                "China Fir", "Chinese Juniper", "Coast Redwood", "Copper Beech", "Cork Oak",
                "Coulter Pine", "Crab Apple Trees","Crape Myrtle", "Cucumber Tree", "Dawn Redwood",
                "Deodar Cedar", "Digger Pine", "Douglas Fir", "Eastern Dogwood",
                "Eastern White Pine",  "English Elm",  "English Maple", "European Chestnut",
                "European Larch","Evergreen Magnolia", "Ginkgo", "Hawthorn Trees",
                "Hisakura Cherry", "Honey Locust",  "Horse Chestnut", "Hybrid Holly",
                "Hybrid Planetrees/Sycamore", "Irish Yew", "Japanese Maple", "Japanese Red Pine",
                "Japanese Snowbell Tree", "Katsura", "Lawson Cypress", "Lombardy Poplar",
                "Monkey Puzzle", "Monterey Pine", "Norway Maple", "Oregon White Oak",
                "Paper Birch", "Pin Oak", "Pindrow Fir", "Poderosa Pine", "Purpleleaf Plum",
                "Red Hickory", "Red Oak", "Shumard Red Oak", "Sierra Redwood", "Silk Tree",
                "Scots Pine", "Shore Pine", "Sugar Maple", "Swedish Whitebeam", "Sweetgum",
                "Weeping European White Birch", "Western Red Cedar", "Western White Pine",
                "Yellow Birch", "Yoshino Cherry",
        };

        adapter = new ArrayAdapter<String> (this, R.layout.list_item, R.id.product_name, treeDir);
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

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                TreeinfoActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {}

            @Override
            public void afterTextChanged(Editable arg0) {}
        });
    }
}




