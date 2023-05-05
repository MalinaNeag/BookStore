package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomePageControllerCustomer {
    @FXML
    private Button goToCart;

    @FXML
    private Button viewPreviousOrders;

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
        m.changeScene("fantasy-page-customer.fxml");
    }

    public void goToCrimePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("crime-page-customer.fxml");
    }

    public void goToDramaPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("drama-page-customer.fxml");
    }

    public void goToRomancePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("romance-page-customer.fxml");
    }

    public void goToSelfImprovementPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("self_improvement-page-customer.fxml");
    }

    public void goToVintagePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("vintage-page-customer.fxml");
    }

    public void goToCartPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("cart-page.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("previous-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }



}
