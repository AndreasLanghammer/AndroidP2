package com.example.andreas.p2gmpictures;


import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Andreas on 2016-10-06.
 */

public class PositionListener implements LocationListener {

    private Location location;
    private double latitude;
    private double longitude;

    public LatLng getPosition(){
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    @Override
    public void onLocationChanged(Location location) {
        this.location = location;

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
