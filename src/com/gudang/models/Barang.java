package com.gudang.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Barang {
    private final StringProperty namaBarang = new SimpleStringProperty();
    private final IntegerProperty jumlahBarang = new SimpleIntegerProperty();

    public Barang(String namaBarang, int jumlahBarang) {
        this.namaBarang.set(namaBarang);
        this.jumlahBarang.set(jumlahBarang);
    }

    public String getNamaBarang() {
        return namaBarang.get();
    }

    public void setNamaBarang(String value) {
        namaBarang.set(value);
    }

    public StringProperty namaBarangProperty() {
        return namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang.get();
    }

    public void setJumlahBarang(int value) {
        jumlahBarang.set(value);
    }

    public IntegerProperty jumlahBarangProperty() {
        return jumlahBarang;
    }
}
