package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import com.example.bookstore.model.CartItemsList;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class CrimeBookPageCustomerController extends CustomerController{
    @Override
    protected String getCategoryName() {
        return "crime";
    }
}
