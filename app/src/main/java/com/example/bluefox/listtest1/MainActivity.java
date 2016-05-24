package com.example.bluefox.listtest1;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> theAdapter;
    private ListView mainMenuView;
    private ActionBarDrawerToggle mDrawerToggle;
    protected DrawerLayout mDrawerLayout;
    private String mActivityTitle;

    private static MainActivity tourInstance;
    public static MainActivity getInstance() {
        return tourInstance;
    }
    //call this outside with customTourActivity.treeList
    public static List<String> treeList = new ArrayList<>();
    public static final Map<String, LatLng> map = new HashMap<String, LatLng>();
    public static final Map<String, String> dMap = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainMenuView = (ListView) findViewById(R.id.mainMenuView);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        mDrawerLayout.openDrawer(Gravity.LEFT);
        addDrawerItems();
        setupDrawer();
        setupMaps();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        tourInstance = this;
    }

    private void addDrawerItems() {
        final String[] homeOptions = {"Home", "Tree Tour", "Tree Directory", "Custom Tree Tour",
                "About"};
        theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, homeOptions);
        mainMenuView.setAdapter(theAdapter);

        mainMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent changeScreen;
                if (position == 4) {
                    changeScreen = new Intent(view.getContext(), AboutActivity.class);
                } else if (position == 1) {
                    changeScreen = new Intent(view.getContext(), TestMapsActivity.class);
                } else if (position == 0) {
                    changeScreen = new Intent(view.getContext(), MainActivity.class);
                }  else if (position == 3) {
                    changeScreen = new Intent(view.getContext(), customTourActivity.class);
                } else {
                    changeScreen = new Intent(view.getContext(), TreeinfoActivity.class);
                }
                startActivityForResult(changeScreen, 0);
                Toast.makeText(MainActivity.this, homeOptions[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.addDrawerListener(mDrawerToggle);
    }

    private void setupMaps() {
        map.put("Deodar Cedar", new LatLng(47.65192, -122.30842000000001));
        map.put("Monterey Pine", new LatLng(47.651595, -122.308527));
        map.put("European Larch", new LatLng(47.651818, -122.308275));
        map.put("China Fir", new LatLng(47.651653, -122.30809899999998));
        map.put("Japanese Snowbell Tree", new LatLng(47.651994, -122.307901));
        map.put("Coast Redwood", new LatLng(47.652029, -122.30717));
        map.put("Coulter Pine", new LatLng(47.651857, -122.30695));
        map.put("Lawson Cypress", new LatLng(47.652102, -122.30696099999999));
        map.put("English Elm", new LatLng(47.65232, -122.306073));
        map.put("Pin Oak", new LatLng(47.65324, -122.305142));
        map.put("Eastern Dogwood", new LatLng(47.653878, -122.305566));
        map.put("Ginkgo", new LatLng(47.654021, -122.305464));
        map.put("American White Elm", new LatLng(47.654787, -122.30501599999998));
        map.put("Honey Locust", new LatLng(47.65444900000001, -122.304839));
        map.put("Silk Tree", new LatLng(47.655029, -122.30567299999998));
        map.put("Pindrow Fir", new LatLng(47.654959, -122.305911));
        map.put("Cork Oak", new LatLng(47.655255, -122.305596));
        map.put("Bay Laurel", new LatLng(47.655076, -122.30631));
        map.put("Cherry Plum", new LatLng(47.655215, -122.30647400000001));
        map.put("Douglas Fir", new LatLng(47.65586, -122.30595500000001));
        map.put("Western Red Cedar", new LatLng(47.655972, -122.305394));
        map.put("Atlas Cedar", new LatLng(47.655829, -122.306344));
        map.put("Red Oak", new LatLng(47.656261, -122.307181));
        map.put("Copper Beech", new LatLng(47.656189, -122.306001));
        map.put("Sugar Maple", new LatLng(47.656530000000004, -122.30630900000001));
        map.put("Paper Birch", new LatLng(47.656301, -122.305668));
        map.put("Swedish Whitebeam", new LatLng(47.656503, -122.305529));
        map.put("Katsura", new LatLng(47.657105, -122.3046));
        map.put("Scots Pine", new LatLng(47.657271, -122.30449300000001));
        map.put("Weeping European White Birch", new LatLng(47.657719, -122.305419));
        map.put("English Maple", new LatLng(47.657336, -122.305571));
        map.put("Horse Chestnut", new LatLng(47.657045, -122.306081));
        map.put("Japanese Maple", new LatLng(47.657497, -122.30583200000001));
        map.put("Yoshino Cherry", new LatLng(47.657739, -122.30706299999999));
        map.put("Cedar of Lebanon", new LatLng(47.658111, -122.306808));
        map.put("Sweetgum", new LatLng(47.658452, -122.30724000000001));
        map.put("Yellow Birch", new LatLng(47.65825, -122.30761799999999));
        map.put("Japanese Red Pine", new LatLng(47.658808, -122.30781400000001));
        map.put("Red Hickory", new LatLng(47.658743, -122.308388));
        map.put("Monkey Puzzle", new LatLng(47.658147, -122.30817000000002));
        map.put("Black Walnut", new LatLng(47.657896, -122.308109));
        map.put("Bur Oak", new LatLng(47.658398, -122.30919199999998));
        map.put("Hybrid Planetrees/Sycamore", new LatLng(47.657921, -122.309549));
        map.put("Digger Pine", new LatLng(47.657027, -122.31003199999999));
        map.put("Eastern White Pine", new LatLng(47.657161, -122.310217));
        map.put("Western White Pine", new LatLng(47.657121, -122.30896600000001));
        map.put("Purpleleaf Plum", new LatLng(47.656523, -122.308126));
        map.put("Norway Maple", new LatLng(47.656496, -122.30854900000001));
        map.put("Shumard Red Oak", new LatLng(47.655547, -122.30945800000002));
        map.put("Hisakura Cherry", new LatLng(47.655227, -122.30861));
        map.put("Lombardy Poplar", new LatLng(47.65487, -122.31022));
        map.put("Shore Pine", new LatLng(47.65509, -122.310276));
        map.put("Poderosa Pine", new LatLng(47.654958, -122.310863));
        map.put("Bristlecone Pine", new LatLng(47.654915, -122.310617));
        map.put("Evergreen Magnolia", new LatLng(47.653802, -122.30948200000002));
        map.put("European Chestnut", new LatLng(47.653768, -122.30900500000001));
        map.put("Hybrid Holly", new LatLng(47.654338, -122.30794500000002));
        map.put("Dawn Redwood", new LatLng(47.654537000000005, -122.30664200000001));
        map.put("Crab Apple Trees", new LatLng(47.65393, -122.30691300000001));
        map.put("Cucumber Tree", new LatLng(47.652315, -122.30721000000001));
        map.put("Hawthorn Trees", new LatLng(47.652118, -122.30737700000002));
        map.put("Sierra Redwood", new LatLng(47.652187, -122.307527));
        map.put("Crape Myrtle", new LatLng(47.652156, -122.308004));
        map.put("Irish Yew", new LatLng(47.652272, -122.308841));
        map.put("Chinese Juniper", new LatLng(47.652535, -122.30877100000001));
        map.put("Oregon White Oak", new LatLng(47.652855, -122.309166));

        dMap.put("Deodar Cedar", "deodarcedar");
        dMap.put("Monterey Pine", "montereypine");
        dMap.put("European Larch", "europeanlarch");
        dMap.put("China Fir", "chinafir");
        dMap.put("Japanese Snowbell Tree", "japanesesnowbelltree");
        dMap.put("Coast Redwood", "coastredwood");
        dMap.put("Coulter Pine", "coulterpine");
        dMap.put("Lawson Cypress", "lawsoncypress");
        dMap.put("English Elm", "englishelm");
        dMap.put("Pin Oak", "pinoak");
        dMap.put("Eastern Dogwood", "easterndogwood");
        dMap.put("Ginkgo", "ginkgo");
        dMap.put("American White Elm", "americanwhiteelm");
        dMap.put("Honey Locust", "honeylocust");
        dMap.put("Silk Tree", "silktree");
        dMap.put("Pindrow Fir", "pindrowfir");
        dMap.put("Cork Oak", "corkoak");
        dMap.put("Bay Laurel", "baylaurel");
        dMap.put("Cherry Plum", "cherryplum");
        dMap.put("Douglas Fir", "douglasfir");
        dMap.put("Western Red Cedar", "westernredcedar");
        dMap.put("Atlas Cedar", "atlascedar");
        dMap.put("Red Oak", "redoak");
        dMap.put("Copper Beech", "copperbeach");
        dMap.put("Sugar Maple", "sugarmaple");
        dMap.put("Paper Birch", "paperbirch");
        dMap.put("Swedish Whitebeam", "swedishwhitebeam");
        dMap.put("Katsura", "katsura");
        dMap.put("Scots Pine", "scotspine");
        dMap.put("Weeping European White Birch", "weepingeuropeanwhitebirch");
        dMap.put("English Maple", "englishmaple");
        dMap.put("Horse Chestnut", "horsechestnut");
        dMap.put("Japanese Maple", "japanesemaple");
        dMap.put("Yoshino Cherry", "yoshinocherry");
        dMap.put("Cedar of Lebanon", "cedaroflebanon");
        dMap.put("Sweetgum", "sweetgum");
        dMap.put("Yellow Birch", "yellowbirch");
        dMap.put("Japanese Red Pine", "japaneseredpine");
        dMap.put("Red Hickory", "redhickory");
        dMap.put("Monkey Puzzle", "monkeypuzzle");
        dMap.put("Black Walnut", "blackwalnut");
        dMap.put("Bur Oak", "buroak");
        dMap.put("Hybrid Planetrees/Sycamore", "hybridplanetreessycamore");
        dMap.put("Digger Pine", "diggerpine");
        dMap.put("Eastern White Pine", "easternwhitepine");
        dMap.put("Western White Pine", "westernwhitepine");
        dMap.put("Purpleleaf Plum", "purpleleafplum");
        dMap.put("Norway Maple", "norwaymaple");
        dMap.put("Shumard Red Oak", "shumardredoak");
        dMap.put("Hisakura Cherry", "hisakuracherry");
        dMap.put("Lombardy Poplar", "lombardypoplar");
        dMap.put("Shore Pine", "shorepine");
        dMap.put("Poderosa Pine", "poderosapine");
        dMap.put("Bristlecone Pine", "bristleconepine");
        dMap.put("Evergreen Magnolia", "evergreenmagnolia");
        dMap.put("European Chestnut", "europeanchestnut");
        dMap.put("Hybrid Holly", "hybridholly");
        dMap.put("Dawn Redwood", "dawnredwood");
        dMap.put("Crab Apple Trees", "crabappletrees");
        dMap.put("Cucumber Tree", "cucumbertree");
        dMap.put("Hawthorn Trees", "hawthorntrees");
        dMap.put("Sierra Redwood", "sierraredwood");
        dMap.put("Crape Myrtle", "crapemyrtle");
        dMap.put("Irish Yew", "irishyew");
        dMap.put("Chinese Juniper", "chinesejuniper");
        dMap.put("Oregon White Oak", "oregonwhiteoak");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Activate the navigation drawer toggle
        return mDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }


}


