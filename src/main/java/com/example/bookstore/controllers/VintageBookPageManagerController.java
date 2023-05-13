package com.example.bookstore.controllers;

import com.example.bookstore.Main;

import java.io.IOException;

public class VintageBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "vintage";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("vintage-page-manager.fxml");
    }
}
