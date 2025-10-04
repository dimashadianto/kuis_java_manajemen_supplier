package com.gudang.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    void openBarang(ActionEvent event) throws Exception {
        Stage stage = (Stage) new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Barang.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Manajemen Barang");
        stage.show();
    }

    @FXML
    void openSupplier(ActionEvent event) throws Exception {
        
    }

}
