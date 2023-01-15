package id.ac.poliban.e020320095.wisataapp095.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Azhar Rivaldi on 22-12-2019.
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
