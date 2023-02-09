package id.ac.poliban.e020320095.wisataapp095.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by eka on 01/02/2023.
 */

public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}
