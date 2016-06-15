package com.fbtreetour.teamsonder.listtest1;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationServices;

public class customTourActivity extends Menu implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {
    GoogleApiClient mGoogleApiClient;
    double initLng = -122.308097;
    double initLat = 47.658129;
    Location mLastLocation;

    @Override
    public void onConnected(Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            initLat = mLastLocation.getLatitude();
            initLng = mLastLocation.getLongitude();
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {}

    @Override
    public void onConnectionSuspended(int i) {}

    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_custom_tour, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);

        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(customTourActivity.this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }

        Button deleteb = (Button)findViewById(R.id.deletetourbutton);
        deleteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.treeList.size() == 0) {
                    Toast.makeText(customTourActivity.this, "You have yet to add any trees.", Toast.LENGTH_LONG).show();
                } else {
                    MainActivity.treeList.clear();
                    finish();
                    startActivity(getIntent());
                }
            }
        });

        Button b = (Button)findViewById(R.id.begintourbutton);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (MainActivity.treeList.size() == 0) {
                    Toast.makeText(customTourActivity.this, "Add trees to your tour from the tree directory.", Toast.LENGTH_LONG).show();
                } else if (MainActivity.treeList.size() == 1) {
                    String currTree = MainActivity.treeList.get(0);
                    LatLng currDest = MainActivity.map.get(currTree);
                    String treeCoord = currDest.toString();
                    treeCoord = treeCoord.substring(10, treeCoord.length() -1);
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=" + treeCoord + "&mode=w");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                } else {
                    String userLoc = String.valueOf(initLat) + "," + String.valueOf(initLng);
                    String mapString = "http://maps.google.com/maps?saddr=" + userLoc;
                    for (int i = 0; i < MainActivity.treeList.size(); i++) {
                        String loopTree = new String(MainActivity.treeList.get(i));
                        LatLng loopDest = (MainActivity.map.get(loopTree));
                        String loopTreeCoord = new String(loopDest.toString());
                        loopTreeCoord = new String(loopTreeCoord.substring(10, loopTreeCoord.length() - 1));
                        if (i == 0) {
                            mapString += "&daddr=" + loopTreeCoord;
                        } else {
                            mapString += "+to:" + loopTreeCoord;
                        }
                    }
                    mapString += "&dirflg=w";
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapString));
                    browserIntent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                    startActivity(browserIntent);
                }
            }
        });

        ListView theListView = (ListView)findViewById(R.id.customTour);
        ListAdapter theAdapter = new MyAdapter(this, MainActivity.treeList);
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LatLng currDest = MainActivity.map.get(MainActivity.treeList.get(position));
                String treeCoord = currDest.toString();
                treeCoord = treeCoord.substring(10, treeCoord.length() -1);
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + treeCoord + "&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

}
