package com.gudang.controllers;

import com.gudang.models.Barang;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BarangController {

    @FXML
    private TableColumn<Barang, Integer> colJumlahBarang;

    @FXML
    private TableColumn<Barang, String> colNamaBarang;

    @FXML
    private TableView<Barang> tblBarang;

    @FXML
    private TextField txtJumlahBarang;

    @FXML
    private TextField txtNamaBarang;

    private ObservableList<Barang> data = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        colNamaBarang.setCellValueFactory(cell -> cell.getValue().namaBarangProperty());
        colJumlahBarang.setCellValueFactory(cell -> cell.getValue().jumlahBarangProperty().asObject());
        tblBarang.setItems(data);
    }

    @FXML
    void tambahBarang() {
        if (!txtNamaBarang.getText().isEmpty() && !txtJumlahBarang.getText().isEmpty()) {
            data.add(new Barang(txtNamaBarang.getText(), Integer.parseInt(txtJumlahBarang.getText())));
            txtNamaBarang.clear();
            txtJumlahBarang.clear();
        }
    }

    @FXML
    void editBarang() {
        Barang selected = tblBarang.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setNamaBarang(txtNamaBarang.getText());
            selected.setJumlahBarang(Integer.parseInt(txtJumlahBarang.getText()));
            tblBarang.refresh();
            txtNamaBarang.clear();
            txtJumlahBarang.clear();
        }
    }

    @FXML
    void hapusBarang() {
        Barang selected = tblBarang.getSelectionModel().getSelectedItem();
        if (selected != null) {
            data.remove(selected);
        }
    }

}
