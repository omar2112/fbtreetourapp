package com.example.bluefox.listtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class customTourActivity extends AppCompatActivity {

    private static customTourActivity tourInstance;
    public static customTourActivity getInstance() {
        return tourInstance;
    }
    //call this outside with customTourActivity.treeList
    public static List<String>treeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tourInstance = this;
        setContentView(R.layout.activity_custom_tour);

    }
}
