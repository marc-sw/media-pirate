package com.marcsw.mediapirate.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InputController {

    @FXML
    private TextField userInput;

    @FXML
    public void onRunButtonClick() {
        System.out.println("user input: " + userInput.getText());
        userInput.setText("");
    }
}
