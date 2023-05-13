package com.example.bookstore.controllers;

import com.example.bookstore.Main;

import java.io.IOException;

public class CrimeBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "crime";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("crime-page-manager.fxml");
    }
}
