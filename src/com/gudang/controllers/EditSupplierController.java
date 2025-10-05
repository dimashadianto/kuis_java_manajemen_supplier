package com.gudang.controllers;

import com.gudang.models.Supplier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditSupplierController {

    @FXML
    private TextField txtAlamat;

    @FXML
    private TextField txtKode;

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtTelepon;

    private Supplier data; 

    public void setSupplierData(Supplier supplier) {
        this.data = supplier;

        txtKode.setText(supplier.getKode());
        txtNama.setText(supplier.getNama());
        txtAlamat.setText(supplier.getAlamat());
        txtTelepon.setText(supplier.getTelepon());

        txtKode.setDisable(true);
    }

    @FXML
    void editSupplier(ActionEvent event) {
        data.setNama(txtNama.getText());
        data.setAlamat(txtAlamat.getText());
        data.setTelepon(txtTelepon.getText());

        Stage stage = (Stage) txtNama.getScene().getWindow();
        stage.close();
    }
    
}
