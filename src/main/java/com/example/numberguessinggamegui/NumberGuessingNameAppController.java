package com.example.numberguessinggamegui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NumberGuessingNameAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}