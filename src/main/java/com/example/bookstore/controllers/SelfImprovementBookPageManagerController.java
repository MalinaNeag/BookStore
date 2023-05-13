package com.example.bookstore.controllers;

import com.example.bookstore.Main;

import java.io.IOException;

public class SelfImprovementBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "self-improvement";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("self_improvement-page-manager.fxml");
    }
}
