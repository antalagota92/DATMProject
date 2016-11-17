package com.example.aantal.findyourfriends;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.Calendar;
import java.util.List;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MapsActivity extends FragmentActivity {

    private GoogleMap googleMap; // Might be null if Google Play services APK is not available.

    private List<Friend> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        handleMapInitialization();
    }

    @Override
    protected void onResume() {
        super.onResume();

        handleMapInitialization();
    }

    private void handleMapInitialization() {
        final AssetManager assetManager = getAssets();
        final Calendar calendar = Calendar.getInstance();

            friends = FriendContainer.getFriends();

            setUpMapIfNeeded();

            if (googleMap != null) {

            }
    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (googleMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (googleMap != null) {
                googleMap.setMyLocationEnabled(true);
                googleMap.clear();
            }
        }
    }
}
