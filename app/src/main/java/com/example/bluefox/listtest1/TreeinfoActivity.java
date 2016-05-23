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

        String[] treeDir = new String[] {"Deodar Cedar", "Monterey Pine", "European Larch",
                "China Fir", "Japanese Snowbell Tree", "Coast Redwood", "Coulter Pine",
                "Lawson Cypress", "English Elm", "Pin Oak", "Eastern Dogwood", "Ginkgo",
                "American White Elm", "Honey Locust", "Silk Tree", "Pindrow Fir", "Cork Oak",
                "Bay Laurel", "Cherry Plum", "Douglas Fir", "Western Red Cedar", "Atlas Cedar",
                "Red Oak", "Copper Beech", "Sugar Maple", "Paper Birch", "Swedish Whitebeam",
                "Katsura", "Scots Pine", "Weeping European White Birch", "English Maple",
                "Horse Chestnut", "Japanese Maple", "Yoshino Cherry", "Cedar of Lebanon",
                "Sweetgum", "Yellow Birch", "Japanese Red Pine", "Red Hickory", "Monkey Puzzle",
                "Black Walnut", "Bur Oak", "Hybrid Planetrees/Sycamore", "Digger Pine",
                "Eastern White Pine", "Western White Pine", "Purpleleaf Plum", "Norway Maple",
                "Shumard Red Oak", "Hisakura Cherry", "Lombardy Poplar", "Shore Pine",
                "Poderosa Pine", "Bristlecone Pine", "Evergreen Magnolia", "European Chestnut",
                "Hybrid Holly", "Dawn Redwood", "Crab Apple Trees", "Cucumber Tree",
                "Hawthorn Trees", "Sierra Redwood", "Crape Myrtle", "Irish Yew",
                "Chinese Juniper", "Oregon White Oak"};

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




