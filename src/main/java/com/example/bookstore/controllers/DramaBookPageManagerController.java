package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import java.io.IOException;

public class DramaBookPageManagerController extends ManagerController {
    @Override
    protected String getCategoryName() {
        return "drama";
    }

    @Override
    protected void refreshScene() throws IOException {
        Main m = new Main();
        m.changeScene("drama-page-manager.fxml");
    }
}
