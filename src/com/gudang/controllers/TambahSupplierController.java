package com.gudang.controllers;

import com.gudang.models.Supplier;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class TambahSupplierController {

    @FXML
    private TextField txtAlamat;

    @FXML
    private TextField txtKode;

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtTelepon;

    private ObservableList<Supplier> data;

    public void setSupplierList(ObservableList<Supplier> data) {
        this.data = data;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void simpanSupplier(ActionEvent event) {
        if (txtKode.getText().isEmpty() || txtNama.getText().isEmpty() || txtTelepon.getText().isEmpty()) {
            showAlert("Error", "Field Kode, Nama, dan Telepon wajib diisi!");
            return;
        }

        for (Supplier s : data) {
            if (s.getKode().equalsIgnoreCase(txtKode.getText())) {
                showAlert("Error", "Kode supplier sudah ada!");
                return;
            }
        }

        data.add(new Supplier(txtKode.getText(), txtNama.getText(), txtAlamat.getText(), txtTelepon.getText()));
        txtKode.clear();
        txtNama.clear();
        txtAlamat.clear();
        txtTelepon.clear();
    }

}
