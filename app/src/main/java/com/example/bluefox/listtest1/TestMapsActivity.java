package com.example.bluefox.listtest1;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.LocationSource;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.Marker;

import android.location.LocationManager;

import java.security.Permissions;
import java.util.Map;

//public class TestMapsActivity extends FragmentActivity implements OnMapReadyCallback {
public class TestMapsActivity extends Menu implements OnMapReadyCallback {

    private static final String MY_PREFERENCES = "my_preferences";
    private GoogleMap mMap;
    private static final int REQUEST_ACCESS_FINE_LOCATION = 0;
    GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_maps);
        */
        super.onCreate(savedInstanceState);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkLocationPermission();
        }

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_test_maps, null, false);
        mDrawerLayout.addView(contentView, 0);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        mDrawerLayout.closeDrawer(Gravity.LEFT);



    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Initialize Google Play Services
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
            }
        }
        else {
            /*
             NOTE: This line of code causes my phone to crash. I discovered this when I was
             dealing with permissions BS. I think we should leave this commented until we
             figure out how to make it work with phones < API 23 (mine is 19).
             My location works good though (^_^)b
             mGoogleApiClient.connect();
            */
            mMap.setMyLocationEnabled(true);
        }
        mMap.setInfoWindowAdapter(new CustomWindowAdapter(getLayoutInflater()));
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                String itemValue = marker.getTitle(); // Have this be your tree. Looks like "marker.getTitle()"
                Intent nextActivity = new Intent(TestMapsActivity.this, TreeInformation.class);
                nextActivity.putExtra("trees", itemValue);
                startActivity(nextActivity);
            }
        });

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
        {
            @Override
            public boolean onMarkerClick(Marker arg0) {
                 Toast.makeText(TestMapsActivity.this, "Tap the blue button below to navigate to this tree" +
                        " with the Google Maps app (will open seperately)", Toast.LENGTH_LONG).show();

                return false;
            }
        });

        BitmapDescriptor treeIcon = BitmapDescriptorFactory.fromResource(R.drawable.smalltreeicon);
        LatLng home = new LatLng(47.656642, -122.308213);
        for (Map.Entry<String, LatLng> value : MainActivity.map.entrySet())
            mMap.addMarker(new MarkerOptions().position(value.getValue()).title(value.getKey()).icon(treeIcon).flat(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 16));
    }

    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;
    public boolean checkLocationPermission(){
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

                //Prompt the user once explanation has been shown
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);


            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
}

class CustomWindowAdapter implements InfoWindowAdapter{
    LayoutInflater mInflater;

    public CustomWindowAdapter(LayoutInflater i){
        mInflater = i;
    }

    // This defines the contents within the info window based on the marker

    @Override
    public View getInfoContents(Marker marker) {
        View v = mInflater.inflate(R.layout.activity_tree_window, null);
        TextView tv = (TextView) v.findViewById(R.id.tv1);
        tv.setText(marker.getTitle());
        ImageView iv = (ImageView) v.findViewById(R.id.iv1);
        int id = iv.getResources().getIdentifier(MainActivity.dMap.get(marker.getTitle()),
                "drawable", this.getClass().getPackage().getName());
        iv.setImageResource(id);
        return v;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
}
