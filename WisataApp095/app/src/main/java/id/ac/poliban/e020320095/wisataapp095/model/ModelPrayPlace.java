package id.ac.poliban.e020320095.wisataapp095.model;

import java.io.Serializable;

/**
 * Created by eka on 01/02/2023.
 */

public class ModelPrayPlace implements Serializable {

    private String txtTempatIbadah;
    private double latitude;
    private double longitude;

    public String getTxtTempatIbadah() {
        return txtTempatIbadah;
    }

    public void setTxtTempatIbadah(String txtTempatIbadah) {
        this.txtTempatIbadah = txtTempatIbadah;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
