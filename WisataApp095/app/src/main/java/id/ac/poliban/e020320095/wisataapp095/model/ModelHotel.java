package id.ac.poliban.e020320095.wisataapp095.model;

import java.io.Serializable;

/**
 * Created by eka on 01/02/2023.
 */

public class ModelHotel implements Serializable {

    private String txtNamaHotel, txtAlamatHotel, txtNoTelp, Koordinat, GambarHotel;

    public String getTxtNamaHotel() {
        return txtNamaHotel;
    }

    public void setTxtNamaHotel(String txtNamaHotel) {
        this.txtNamaHotel = txtNamaHotel;
    }

    public String getTxtAlamatHotel() {
        return txtAlamatHotel;
    }

    public void setTxtAlamatHotel(String txtAlamatHotel) {
        this.txtAlamatHotel = txtAlamatHotel;
    }

    public String getTxtNoTelp() {
        return txtNoTelp;
    }

    public void setTxtNoTelp(String txtNoTelp) {
        this.txtNoTelp = txtNoTelp;
    }

    public String getKoordinat() {
        return Koordinat;
    }

    public void setKoordinat(String koordinat) {
        this.Koordinat = koordinat;
    }

    public String getGambarHotel() {
        return GambarHotel;
    }

    public void setGambarHotel(String gambarHotel) {
        this.GambarHotel = gambarHotel;
    }
}
