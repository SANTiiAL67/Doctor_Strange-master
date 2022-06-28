package com.example.doctorstrangedemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        stage.getIcons().add(new Image("https://cdn6.aptoide.com/imgs/7/1/9/7193e8b89af7d5650baa68bc75a64538_icon.png"));
        stage.setTitle("Doctor Strange");
        stage.setFullScreen(false);
        stage.setResizable(false);
        Scene scene = new Scene(fxmlLoader.load(), 1360, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}