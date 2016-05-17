package com.example.bluefox.listtest1;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
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

//public class TestMapsActivity extends FragmentActivity implements OnMapReadyCallback {
public class TestMapsActivity extends MainActivity implements OnMapReadyCallback {

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


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
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
            mGoogleApiClient.connect();            mMap.setMyLocationEnabled(true);
        }

        //remove this line if custom infowindo doesn't work.
        mMap.setInfoWindowAdapter(new CustomWindowAdapter(getLayoutInflater()));
        //UiSettings.setZoomControlsEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        //mMap.setOnInfoWindowClickListener(this);
        //mMap.setOnMarkerClickListener((GoogleMap.OnMarkerClickListener) this);
        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                String itemValue = marker.getTitle(); // Have this be your tree. Looks like "marker.getTitle()"
                Intent nextActivity = new Intent(TestMapsActivity.this, TreeInformation.class);
                nextActivity.putExtra("trees", itemValue);
                startActivity(nextActivity);
            }
        });

        /* code to open up the web browser
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            startActivity(browserIntent);
         */

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
        {
            @Override
            public boolean onMarkerClick(Marker arg0) {
                 Toast.makeText(TestMapsActivity.this, "Tap the blue button below to navigate to this tree" +
                        " with the Google Maps app (will open seperately)", Toast.LENGTH_LONG).show();

                return false;
            }
        });


        // Add a marker in Sydney and move the camera
        LatLng home = new LatLng(47.656642, -122.308213);
        LatLng yoshinoCherry = new LatLng(47.658129, -122.308097);
        LatLng cedarOfLebanon = new LatLng(47.658723, -122.307774);
        LatLng hybridHolly = new LatLng(47.654312, -122.307866);
        LatLng atlasCedar = new LatLng(47.655827, -122.306728);

        LatLng lombardyPoplar = new LatLng(47.654491, -122.310213);
        LatLng cherryPlum = new LatLng(47.655205, -122.306490);
        LatLng hybridPlanetreesSycamore = new LatLng(47.658916, -122.309553);
        LatLng deodarCedar = new LatLng(47.652013, -122.308593);
        LatLng montereyPine = new LatLng(47.651556, -122.308437);
        LatLng evergreenMagnolia = new LatLng(47.653798, -122.309526);
        LatLng crabappleTrees = new LatLng(47.653872, -122.306887);
        LatLng europeanLarch = new LatLng(47.651689, -122.308093);


        BitmapDescriptor treeIcon = BitmapDescriptorFactory.fromResource(R.drawable.smalltreeicon);
        mMap.addMarker(new MarkerOptions().position(yoshinoCherry).title("Yoshino Cherry").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(cedarOfLebanon).title("Cedar of Lebanon").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(hybridHolly).title("Hybrid Holly").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(atlasCedar).title("Atlas Cedar").icon(treeIcon).flat(true));

        mMap.addMarker(new MarkerOptions().position(lombardyPoplar).title("Lombardy Poplar").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(cherryPlum).title("Cherry Plum").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(hybridPlanetreesSycamore).title("Hybrid Planetrees/Sycamore").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(deodarCedar).title("Deodar Cedar").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(montereyPine).title("Monterey Pine").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(evergreenMagnolia).title("Evergreen Magnolia").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(crabappleTrees).title("Crab Apple Trees").icon(treeIcon).flat(true));

        //mMap.animateCamera(CameraUpdateFactory.zoomBy(10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 16));
        //  mMap.CameraUpdateFactory.zoomTo(20);

        /*
                Toast.makeText(TestMapsActivity.this, "Tap the button to the left to navigate to this tree" +
                " with the Google Maps app (will open seperately)", Toast.LENGTH_LONG).show();


         */

//        // Here, thisActivity is the current activity
//        if (ContextCompat.checkSelfPermission(TestMapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(TestMapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)) {
//
//                // Show an expanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//
//            } else {
//
//                // No explanation needed, we can request the permission.
//
//                ActivityCompat.requestPermissions(TestMapsActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_ACCESS_FINE_LOCATION);
//
//                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
//                // app-defined int constant. The callback method gets the
//                // result of the request.
//            }
//        }
//        if (ContextCompat.checkSelfPermission(TestMapsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//            mMap.setMyLocationEnabled(true);
//        }

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

//                 iv.setImageResource(R.drawable.yoshinocherry);





class CustomWindowAdapter implements InfoWindowAdapter{
    LayoutInflater mInflater;

    public CustomWindowAdapter(LayoutInflater i){
        mInflater = i;
    }

    // This defines the contents within the info window based on the marker

    @Override
    public View getInfoContents(Marker marker) {
        // Getting view from the layout file
        //View v = mInflater.inflate(R.layout.sample_testing_view, null);
        View v;
        ImageView iv;
        TextView tv;
        if (marker.getTitle().equals("Yoshino Cherry")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.yoshinocherry);
        } else if (marker.getTitle().equals("Cedar of Lebanon")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.cedaroflebanon);
        } else if (marker.getTitle().equals("Hybrid Holly")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.hybridholly);
        } else if (marker.getTitle().equals("Atlas Cedar")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.atlascedar);
        } else if (marker.getTitle().equals("Lombardy Poplar")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.lombardypoplar);
        } else if (marker.getTitle().equals("Cherry Plum")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.cherryplum);
        } else if (marker.getTitle().equals("Hybrid Planetrees/Sycamore")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.hybridplanetreessycamore);
        } else if (marker.getTitle().equals("Deodar Cedar")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.deodarcedar);
        } else if (marker.getTitle().equals("Monterey Pine")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.montereypine);
        } else if (marker.getTitle().equals("Evergreen Magnolia")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.evergreenmagnolia);
        } else if (marker.getTitle().equals("Crab Apple Trees")) {
            v = mInflater.inflate(R.layout.activity_tree_window, null);
            tv = (TextView) v.findViewById(R.id.tv1);
            tv.setText(marker.getTitle());
            iv = (ImageView) v.findViewById(R.id.iv1);
            iv.setImageResource(R.drawable.crabappletrees);
        }
        else {
            v = mInflater.inflate(R.layout.sample_testing_view, null);
        }


        // Populate fields

        //TextView title = (TextView) v.findViewById(R.id.tv_info_window_title);
        //title.setText(marker.getTitle());

        //TextView description = (TextView) v.findViewById(R.id.tv_info_window_description);
        //description.setText(marker.getSnippet());
        // Return info window contents

        return v;
    }

    // This changes the frame of the info window; returning null uses the default frame.

    // This is just the border and arrow surrounding the contents specified above

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
}


/*


                 if (i == 2) {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=47.658129, -122.308097&mode=w");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }

 */