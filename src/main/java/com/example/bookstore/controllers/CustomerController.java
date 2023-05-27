package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import com.example.bookstore.model.CartItemsList;
import com.example.bookstore.model.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CustomerController extends UserController {
    @FXML
    private Button goToCart;

    @FXML
    private Button viewPreviousOrders;

    @FXML
    private Button add1, add2, add3, add4, add5, add6, add7, add8, add9;

    @FXML
    private Label AddMessage1, AddMessage2, AddMessage3, AddMessage4, AddMessage5, AddMessage6, AddMessage7, AddMessage8, AddMessage9;
    public void initialize() {
        imageViewArrayList = new ArrayList<>() {{
            add(image1);
            add(image2);
            add(image3);
            add(image4);
            add(image5);
            add(image6);
            add(image7);
            add(image8);
            add(image9);
        }};
        button1ArrayList = new ArrayList<>() {{
            add(add1);
            add(add2);
            add(add3);
            add(add4);
            add(add5);
            add(add6);
            add(add7);
            add(add8);
            add(add9);
        }};
        button2ArrayList = new ArrayList<>() {{
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
            add(null);
        }};

        priceArrayList = new ArrayList<>() {{
            add(price1Label);
            add(price2Label);
            add(price3Label);
            add(price4Label);
            add(price5Label);
            add(price6Label);
            add(price7Label);
            add(price8Label);
            add(price9Label);
        }};

        titleArrayList = new ArrayList<>() {{
            add(title1Label);
            add(title2Label);
            add(title3Label);
            add(title4Label);
            add(title5Label);
            add(title6Label);
            add(title7Label);
            add(title8Label);
            add(title9Label);
        }};

        descriptionArrayList = new ArrayList<>() {{
            add(description1Text);
            add(description2Text);
            add(description3Text);
            add(description4Text);
            add(description5Text);
            add(description6Text);
            add(description7Text);
            add(description8Text);
            add(description9Text);
        }};

        loadImages();
    }

    public void goToHomePage() throws IOException {
        Main m = new Main();
        m.changeScene("home-page-customer.fxml");
    }

    public void goToCartPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cart-page.fxml");
    }

    public void goToPreviousOrdersPage(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("previous-orders-page.fxml");
    }

    public void addItemToCart1() {
        AddMessage1.setVisible(true);
        AddMessage1.setText("Added to cart");
        CartItemsList.add(items.get(0));
    }

    public void addItemToCart2() {
        AddMessage2.setVisible(true);
        AddMessage2.setText("Added to cart");
        CartItemsList.add(items.get(1));
    }

    public void addItemToCart3() {
        AddMessage3.setVisible(true);
        AddMessage3.setText("Added to cart");
        CartItemsList.add(items.get(2));
    }

    public void addItemToCart4() {
        AddMessage4.setVisible(true);
        AddMessage4.setText("Added to cart");
        CartItemsList.add(items.get(3));
    }

    public void addItemToCart5() {
        AddMessage5.setVisible(true);
        AddMessage5.setText("Added to cart");
        CartItemsList.add(items.get(4));
    }

    public void addItemToCart6() {
        AddMessage6.setVisible(true);
        AddMessage6.setText("Added to cart");
        CartItemsList.add(items.get(5));
    }

    public void addItemToCart7() {
        AddMessage7.setVisible(true);
        AddMessage7.setText("Added to cart");
        CartItemsList.add(items.get(6));
    }

    public void addItemToCart8() {
        AddMessage8.setVisible(true);
        AddMessage8.setText("Added to cart");
        CartItemsList.add(items.get(7));
    }

    public void addItemToCart9() {
        AddMessage9.setVisible(true);
        AddMessage9.setText("Added to cart");
        CartItemsList.add(items.get(8));
    }

}
