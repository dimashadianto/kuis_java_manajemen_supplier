package com.gudang.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Supplier {
    private final SimpleStringProperty kode = new SimpleStringProperty();
    private final SimpleStringProperty nama = new SimpleStringProperty();
    private final SimpleStringProperty alamat = new SimpleStringProperty();
    private final SimpleStringProperty telepon = new SimpleStringProperty();

    public Supplier(String kode, String nama, String alamat, String telepon) {
        this.kode.set(kode);
        this.nama.set(nama);
        this.alamat.set(alamat);
        this.telepon.set(telepon);
    }

    public String getKode() {
        return kode.get();
    }

    public StringProperty kodeProperty() {
        return kode;
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public StringProperty namaProperty() {
        return nama;
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat.set(alamat);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }

    public String getTelepon() {
        return telepon.get();
    }

    public void setTelepon(String telepon) {
        this.telepon.set(telepon);
    }

    public StringProperty teleponProperty() {
        return telepon;
    }
}
