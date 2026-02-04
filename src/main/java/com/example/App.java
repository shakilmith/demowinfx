package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloMobileFX extends Application {

    @Override
    public void start(Stage stage) {

        Label text = new Label("Press the button");
        Button button = new Button("Click me");

        button.setOnAction(e -> text.setText("Hello, JavaFX!"));

        VBox root = new VBox(20);
        root.setPadding(new Insets(60, 20, 20, 20)); // top padding for status bar
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(text, button);

        Scene scene = new Scene(root, 360, 640);

        stage.setTitle("JavaFX Mobile Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
