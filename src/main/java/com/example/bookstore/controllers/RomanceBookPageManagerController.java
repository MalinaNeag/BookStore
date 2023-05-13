package com.example.bookstore.controllers;

import com.example.bookstore.Main;

import java.io.IOException;

public class RomanceBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "romance";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("romance-page-manager.fxml");
    }
}
