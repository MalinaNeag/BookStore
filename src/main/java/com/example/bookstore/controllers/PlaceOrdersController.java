package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PlaceOrdersController {
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private TextField telephoneTextField;

    @FXML
    private Button submitButton;

    @FXML
    private Label successLabel;

    @FXML
    private void handleSubmitButton() {
        String name = nameTextField.getText();
        String address = addressTextField.getText();
        String postalCode = postalCodeTextField.getText();
        String telephone = telephoneTextField.getText();

        if (name.isEmpty()) {
            showErrorMessage("Error:", "Name field is empty.");
            return;
        }

        if (address.isEmpty()) {
            showErrorMessage("Error:", "Address field is empty.");
            return;
        }

        if (postalCode.isEmpty()) {
            showErrorMessage("Error:", "Postal code field is empty.");
            return;
        }

        if (telephone.isEmpty()) {
            showErrorMessage("Error:", "Telephone number field is empty.");
            return;
        }

        if (!isValidName(name)) {
            showErrorMessage("Invalid:", "Name must contain only letters.");
            return;
        }

        if (!isValidPhoneNumber(telephone)) {
            showErrorMessage("Invalid:", "Telephone number must contain exactly 10 digits.");
            return;
        }

        if (!isValidPostalCode(postalCode)) {
            showErrorMessage("Invalid:", "Postal code must contain exactly 6 digits.");
            return;
        }

        placeOrder();
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    private boolean isValidPostalCode(String postalCode) {
        return postalCode.matches("\\d{6}");
    }

    private void placeOrder() {
        clearFields();
        showSuccessMessage("Successful Order", "Your order has been placed successfully!");
    }

    private void showErrorMessage(String title, String message) {
        successLabel.setVisible(true);
        successLabel.setStyle("-fx-text-fill: red;");
        successLabel.setText(title + " " + message);
    }

    private void showSuccessMessage(String title, String message) {
        successLabel.setVisible(true);
        successLabel.setStyle("-fx-text-fill: green;");
        successLabel.setText(title + " " + message);
    }

    private void clearFields() {
        nameTextField.clear();
        addressTextField.clear();
        postalCodeTextField.clear();
        telephoneTextField.clear();
    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("home-page-manager.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("previous-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }
}
