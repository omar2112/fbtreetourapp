package com.example.bluefox.listtest1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(47.656161, -122.309313);
        LatLng yoshinoCherry = new LatLng(47.658129, -122.308097);
        LatLng cedarOfLebanon = new LatLng(47.658723, -122.307774);
        LatLng hybridHolly = new LatLng(47.654312, -122.307866);
        LatLng atlasCedar = new LatLng(47.655865, -122.306878);


        //mMap.addMarker(new MarkerOptions().position(sydney).title("UW Red Square"));
        mMap.addMarker(new MarkerOptions().position(yoshinoCherry).title("Yoshino Cherry"));
        mMap.addMarker(new MarkerOptions().position(cedarOfLebanon).title("Cedar Of Lebanon"));
        mMap.addMarker(new MarkerOptions().position(hybridHolly).title("Hybrid Holly").snippet(""+
                "Against Johnson and Mary Gates Halls, three Hybrid Hollies stand out with their " +
                "dark, evergreen foliage."));
        mMap.addMarker(new MarkerOptions().position(cedarOfLebanon).title("Atlas Cedar"));


        //mMap.animateCamera(CameraUpdateFactory.zoomBy(10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
        //  mMap.CameraUpdateFactory.zoomTo(20);
    }
}
