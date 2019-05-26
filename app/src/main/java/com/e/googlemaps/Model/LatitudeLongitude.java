package com.e.googlemaps.Model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.googlemaps.R;

public class LatitudeLongitude extends AppCompatActivity {

    private double lat;
    private double lon;
    private String marker;

    public LatitudeLongitude (double lat, double lon, String marker) {
        this.lat = lat;
        this.lon = lon;
        this.marker = marker;

    }

    public String getMarker() {
        return marker;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latitude_longitude);
    }
}
