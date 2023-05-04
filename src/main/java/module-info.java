module com.example.bookstore {
    requires javafx.controls;
    requires javafx.fxml;
    requires json;
    requires com.fasterxml.jackson.databind;


    opens com.example.bookstore to javafx.fxml;
    exports com.example.bookstore;
    exports com.example.bookstore.controllers;
    exports com.example.bookstore.model;
    opens com.example.bookstore.controllers to javafx.fxml;
}