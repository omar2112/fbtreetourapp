package com.example.bluefox.listtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class TreeinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treeinfo);
        String[] treeDir = {"Deodar Cedar", "Monterey Pine", "European Larch", "China-Fir",
                "Japanese Snowbell Tree", "Coast Redwood", "Bigcone Pine",
                "Lawson Cypress", "English Elm", "Pin Oak", "Eastern Dogwood", "Ginkgo",
                "American White Elm", "Honey Locust", "Silk Tree", "Pindrow Fir", "Cork Oak"};
        /*
        String[] sciDir = {"Cedrus Deodara, Cornus Nuttallii", "Pinus radiata",
                           "Larix decidua", "Cunninghamia lanceolata"}; */
        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                treeDir);
        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*
                String treePicked = "You selected " +
                        String.valueOf(adapterView.getItemAtPosition(i));

                Toast.makeText(MainActivity.this, treePicked, Toast.LENGTH_SHORT).show();
                */
                //Class<TreeinfoActivity> switchTreeClass = TreeinfoActivity.class;
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

                //Intent changeScreen = new Intent(view.getContext(), TreeinfoActivity.class);
                //Intent changeScreen = new Intent(view.getContext(), switchTreeClass);
                startActivityForResult(changeScreen, 0);
            }
        });
    }
}
