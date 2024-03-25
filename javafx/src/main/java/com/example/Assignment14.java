package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Assignment14 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating buttons with different purposes
        Button button1 = new Button("Kg to Lbs");
        Button button2 = new Button("Km to M");
        Button button3 = new Button("Mm to In");
        Button button4 = new Button("Kg to Oz");

        // Creating text field for integer input
        TextField textField = new TextField();
        textField.setPromptText("Enter an integer");

        // Creating label to display result
        Label resultLabel = new Label();

        // Setting equal size for all buttons
        button1.setPrefSize(100, 50);
        button2.setPrefSize(100, 50);
        button3.setPrefSize(100, 50);
        button4.setPrefSize(100, 50);

        // Creating a grid pane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Adding buttons, text field, and label to the grid pane
        gridPane.add(button1, 0, 0);
        gridPane.add(button2, 1, 0);
        gridPane.add(button3, 2, 0);
        gridPane.add(button4, 3, 0);
        gridPane.add(textField, 0, 1, 4, 1);
        gridPane.add(resultLabel, 0, 3, 4, 1);

        // Event handler for the multiplyButton
        button1.setOnAction(e -> {
            try {
                int value = Integer.parseInt(textField.getText());
                double result = value * 2.20462;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter an integer.");
            }
        });
        button2.setOnAction(e -> {
            try {
                int value = Integer.parseInt(textField.getText());
                double result = value * 1000;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter an integer.");
            }
        });
        button3.setOnAction(e -> {
            try {
                int value = Integer.parseInt(textField.getText());
                double result = value * 0.0393701;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter an integer.");
            }
        });
        button4.setOnAction(e -> {
            try {
                int value = Integer.parseInt(textField.getText());
                double result = value * 35.274;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter an integer.");
            }
        }
        );
        // Creating the scene
        Scene scene = new Scene(gridPane, 500, 200);

        // Setting the stage
        primaryStage.setTitle("Button Multiplication");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}