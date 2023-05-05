package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePageControllerManager {

    @FXML
    private Button viewNewOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button fantasyCategory;

    @FXML
    private Button crimeCategory;

    @FXML
    private Button dramaCategory;

    @FXML
    private Button romanceCategory;

    @FXML
    private Button self_improvementCategory;

    @FXML
    private Button vintageCategory;


    public void goToFantasyPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("fantasy-page-manager.fxml");
    }

    public void goToCrimePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("crime-page-manager.fxml");
    }

    public void goToDramaPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("drama-page-manager.fxml");
    }

    public void goToRomancePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("romance-page-manager.fxml");
    }

    public void goToSelfImprovementPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("self_improvement-page-manager.fxml");
    }

    public void goToVintagePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("vintage-page-manager.fxml");
    }

    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }



}
