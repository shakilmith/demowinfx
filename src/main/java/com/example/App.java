package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label();
        Button button = new Button("Click Me");
        button.setTextFill(Color.BLACK);
        button.setStyle(
                "-fx-font-size: 14px; -fx-text-fill: #333333; -fx-background-color: #f8f9fa; -fx-border-color: #ced4da; -fx-border-radius: 4;"
        );

        //action
        button.setOnAction(e -> {
            label.setText("Hello, JavaFX!");
        });

        label.setStyle("-fx-background-color: white;" +
                "-fx-border-width: 0 0 0 5;" +
                "-fx-padding: 10 15 10 15;" +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 10, 0, 0, 5);"
        );

        VBox root = new VBox(20, button, label);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}