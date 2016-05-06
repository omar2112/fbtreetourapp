package com.example.bluefox.listtest1;

/*
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
*/
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] homeOptions = {"Home", "Tree Tour", "Tree Directory", "Favorites",
                                "About", "Contact Us", "Help"};
        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                homeOptions);
        ListView mainMenuView = (ListView) findViewById(R.id.mainMenuView);

        mainMenuView.setAdapter(theAdapter);

        mainMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent changeScreen;
                if (i == 4) {
                    changeScreen = new Intent(view.getContext(), AboutActivity.class);
                } else if (i == 1) {
                    changeScreen = new Intent(view.getContext(), TestMapsActivity.class);
                }


                else {
                    changeScreen = new Intent(view.getContext(), TreeinfoActivity.class);

                }

                startActivityForResult(changeScreen, 0);

                /*
                 if (i == 2) {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=47.658129, -122.308097&mode=w");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }
                */
            }
        });


    }
     //   });


}
