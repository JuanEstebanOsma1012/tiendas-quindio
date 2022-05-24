package co.edu.uniquindio.tiendaQuindio.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label LblMensajeErrorIngreso;

    @FXML
    private TextField txtContraseñaUsuarioIngresar;

    @FXML
    private TextField txtEmailUsuarioIngresar;

    @FXML
    void ingresarEnAplicacion(ActionEvent event) {

    }

    @FXML
    void registrarseEnAplicacion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert LblMensajeErrorIngreso != null : "fx:id=\"LblMensajeErrorIngreso\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtContraseñaUsuarioIngresar != null : "fx:id=\"txtContraseñaUsuarioIngresar\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtEmailUsuarioIngresar != null : "fx:id=\"txtEmailUsuarioIngresar\" was not injected: check your FXML file 'Login.fxml'.";

    }
}

