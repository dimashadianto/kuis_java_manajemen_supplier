package com.gudang.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Label labelStatus;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void loginAction(ActionEvent event) {
        String user = txtUsername.getText();
        String password = txtPassword.getText();

        if (user.equals("admin") && password.equals("123")) {
            try {
                labelStatus.setText("");
                Stage stage = (Stage) txtUsername.getScene().getWindow();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Menu.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Menu Utama");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            labelStatus.setText("Login gagal!");
        }
    }

}
