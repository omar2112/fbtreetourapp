package com.example.bluefox.listtest1;

        import android.content.Context;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.location.Criteria;
        import android.location.Location;
        import android.location.LocationListener;
        import android.location.LocationProvider;
        import android.net.Uri;
        import android.provider.Settings;
        import android.support.v4.app.ActivityCompat;
        import android.support.v4.content.ContextCompat;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.MapFragment;
        import com.google.android.gms.maps.model.LatLng;



        import com.google.android.gms.common.api.GoogleApiClient;
        import com.google.android.gms.maps.model.LatLng;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

        import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

        import android.location.LocationManager;

        import java.security.Permissions;

        import android.os.Build;

        import android.provider.Settings;

        import android.Manifest;


        import android.support.v4.app.Fragment;

//import com.google.android.gms.location;

        import com.google.android.gms.common.ConnectionResult;
        import com.google.android.gms.common.api.GoogleApiClient;
        import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
        import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
//import com.google.android.gms.location.LocationListener;
        import com.google.android.gms.location.LocationRequest;
        import com.google.android.gms.location.LocationServices;

        import java.util.Timer;
        import java.util.TimerTask;


//@RuntimePermissions
public class customTourActivity extends MainActivity implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {
    private static final int REQUEST_ACCESS_FINE_LOCATION = 0;
    GoogleApiClient mGoogleApiClient;
    double initLng = -122.308097;
    double initLat = 47.658129;
    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;
    LocationManager lm;
    Location location;
    Location mLastLocation;
    private TextView mLatitudeText,mLongitudeText, mTextTest,
            mTextPerRes;

    @Override
    public void onConnected(Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            initLat = mLastLocation.getLatitude();
            initLng = mLastLocation.getLongitude();
            //mLatitudeText.setText(String.valueOf(mLastLocation.getLatitude()));
            //mLongitudeText.setText(String.valueOf(mLastLocation.getLongitude()));
            Toast.makeText(customTourActivity.this, String.valueOf(initLat) + " " + String.valueOf(initLng), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }
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
        //setContentView(R.layout.activity_custom_tour);
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

        Button b = (Button)findViewById(R.id.begintourbutton);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (MainActivity.treeList.size() == 0) {
                    Toast.makeText(customTourActivity.this, "Hi", Toast.LENGTH_LONG).show();
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
        ArrayAdapter<String> theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MainActivity.treeList);
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
