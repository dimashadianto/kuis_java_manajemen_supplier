package com.gudang.controllers;

import com.gudang.models.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SupplierController {

    @FXML
    private TableColumn<Supplier, String> colAlamat;

    @FXML
    private TableColumn<Supplier, String> colKode;

    @FXML
    private TableColumn<Supplier, String> colNama;

    @FXML
    private TableColumn<Supplier, String> colTelepon;

    @FXML
    private TableView<Supplier> tblSupplier;

    private ObservableList<Supplier> data = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        data = FXCollections.observableArrayList();

        colKode.setCellValueFactory(cell -> cell.getValue().kodeProperty());
        colNama.setCellValueFactory(cell -> cell.getValue().namaProperty());
        colAlamat.setCellValueFactory(cell -> cell.getValue().alamatProperty());
        colTelepon.setCellValueFactory(cell -> cell.getValue().teleponProperty());

        tblSupplier.setItems(data);
    }

    @FXML
    void openAddSupplier(ActionEvent event) throws Exception {
        Stage stage = (Stage) new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/TambahSupplier.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Tambah Supplier");

        TambahSupplierController controller = loader.getController();
        controller.setSupplierList(data);

        stage.showAndWait();
    }

    @FXML
    void openEditSupplier(ActionEvent event) throws Exception {
        Supplier selectedSupplier = tblSupplier.getSelectionModel().getSelectedItem();

        if (selectedSupplier != null) {
            Stage stage = (Stage) new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/EditSupplier.fxml"));
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.setTitle("Edit Supplier");

            EditSupplierController controller = loader.getController();
            controller.setSupplierData(selectedSupplier);

            stage.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Pilih data yang ingin diedit!");
            alert.showAndWait();
        }
    }

    @FXML
    void deleteSupplier(ActionEvent event) {

    }

}
