package com.example.doctorstrangedemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class PartidaController<root> implements Initializable {
    private Scene scene;
    private Parent root;
    String n;

    @FXML
    private TextField fieldVida;

    @FXML
    private Label jugadorDosAlias;

    @FXML
    private Label jugadorUnoAlias;

    @FXML
    private Button movimientoAtaque1;

    @FXML
    private Button movimientoAtaque2;

    @FXML
    private Button movimientoDefensa1;

    @FXML
    private Button movimientoDefensa2;

    @FXML
    private ComboBox<?> seleccionarSuperheroeJuego;

    @FXML
    private Label superheroeNombreVida;

    @FXML
    private Label turnos;

    public void ataque1(ActionEvent event) {
     receiveData(event);
     jugadorUnoAlias.setText(n);
    }

    public void ataque2(ActionEvent event) {

    }


    public void defensa1(ActionEvent event) {

    }


    public void defensa2(ActionEvent event) {

    }

    private void receiveData(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Jugador u = (Jugador) stage.getUserData();
        n = u.getEquipo().getListaSuperheroe().get(0).getAliasSuperheroe();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
