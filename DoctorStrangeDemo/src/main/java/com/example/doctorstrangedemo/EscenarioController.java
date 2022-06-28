package com.example.doctorstrangedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EscenarioController {
    Escenario escenario =new Escenario("Sanctum Sanctorum"); ;

    private Parent root;

    public void siguienteScena(ActionEvent event) throws IOException {
        if (escenario.getNombreEscenario().equals("Sanctum Sanctorum")){
            escenario= new Escenario("Sanctum Sanctorum");
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/doctorstrangedemo/personaje-view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    private void enviarDatos(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/doctorstrangedemo/partida.fxml"));
            stage.setUserData(escenario);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.printf("Error: %s%n", e.getMessage());
        }
    }
}

