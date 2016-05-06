package com.example.bluefox.listtest1;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.view.View;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;

public class TestMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        //remove this line if custom infowindo doesn't work.
        mMap.setInfoWindowAdapter(new CustomWindowAdapter(getLayoutInflater()));

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
        LatLng evergreenMagnolias = new LatLng(47.653798, -122.309526);
        LatLng crabappleTrees = new LatLng(47.653872, -122.306887);

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
        mMap.addMarker(new MarkerOptions().position(evergreenMagnolias).title("Evergreen Magnolias").icon(treeIcon).flat(true));
        mMap.addMarker(new MarkerOptions().position(crabappleTrees).title("Crab Apple Trees").icon(treeIcon).flat(true));

        //mMap.animateCamera(CameraUpdateFactory.zoomBy(10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 16));
        //  mMap.CameraUpdateFactory.zoomTo(20);
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
        // Getting view from the layout file
        //View v = mInflater.inflate(R.layout.sample_testing_view, null);
        View v;
        if (marker.getTitle().equals("Yoshino Cherry")) {
            v = mInflater.inflate(R.layout.sample_yoshinocherry_view, null);
        } else if (marker.getTitle().equals("Cedar of Lebanon")) {
            v = mInflater.inflate(R.layout.sample_cedaroflebanon_view, null);
        } else if (marker.getTitle().equals("Hybrid Holly")) {
            v = mInflater.inflate(R.layout.sample_hybridholly_view, null);
        } else if (marker.getTitle().equals("Atlas Cedar")) {
            v = mInflater.inflate(R.layout.sample_atlascedar_view, null);
        } else if (marker.getTitle().equals("Lombardy Poplar")) {
            v = mInflater.inflate(R.layout.sample_lombardypoplar_view, null);
        } else if (marker.getTitle().equals("Cherry Plum")) {
            v = mInflater.inflate(R.layout.sample_cherryplum_view, null);
        } else if (marker.getTitle().equals("Hybrid Planetrees/Sycamore")) {
            v = mInflater.inflate(R.layout.sample_hybridplanetreessycamore_view, null);
        } else if (marker.getTitle().equals("Deodar Cedar")) {
            v = mInflater.inflate(R.layout.sample_deodarcedar_view, null);
        } else if (marker.getTitle().equals("Monterey Pine")) {
            v = mInflater.inflate(R.layout.sample_montereypine_view, null);
        } else if (marker.getTitle().equals("Evergreen Magnolias")) {
            v = mInflater.inflate(R.layout.sample_evergreenmagnolias_view, null);
        } else if (marker.getTitle().equals("Crab Apple Trees")) {
            v = mInflater.inflate(R.layout.sample_crabappletrees_view, null);
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


//We need to create a default XML for every infowindow that includes name, picture, and link to tree tour.
//get this working by tomorrow, it's important to preview.

/*testing custom infoWindows
    private class CustomInfoWindowAdapter implements InfoWindowAdapter {

        private View view;

        public CustomInfoWindowAdapter() {
            view = getLayoutInflater().inflate(R.layout.custom_info_window,
            null);
        }

        @Override
        public View getInfoContents(Marker marker) {

            if (MainActivity.this.marker != null
                    && MainActivity.this.marker.isInfoWindowShown()) {
                MainActivity.this.marker.hideInfoWindow();
                MainActivity.this.marker.showInfoWindow();
            }
            return null;
        }

        @Override
        public View getInfoWindow(final Marker marker) {
            return null; //we want to keep the default window, unless we want to mess with size,
                        //which we very well may have to. shit.
        }

    }
 */