package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import java.io.IOException;

public class FantasyBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "fantasy";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("fantasy-page-manager.fxml");
    }
}
