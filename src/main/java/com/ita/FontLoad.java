package com.ita;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FontLoad extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("JavaFX Application");
        Button button = new Button("My Button");
        VBox box = new VBox(15, label, button);
        box.setAlignment(Pos.CENTER);
        Scene scene = new Scene(box, 500, 300);
        scene.getStylesheets().add(getClass().getResource("/fontstyle.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
