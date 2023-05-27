package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import com.example.bookstore.model.CartItemsList;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public abstract class UserController {

    @FXML
    protected Button SignOut;

    @FXML
    protected Button goToHome;

    @FXML
    protected ImageView image1;

    @FXML
    protected ImageView image2;
    @FXML
    protected ImageView image3;
    @FXML
    protected ImageView image4;
    @FXML
    protected ImageView image5;
    @FXML
    protected ImageView image6;
    @FXML
    protected ImageView image7;
    @FXML
    protected ImageView image8;
    @FXML
    protected ImageView image9;
    @FXML
    protected Label price1Label,price2Label,price3Label,price4Label,price5Label,price6Label,price7Label,price8Label,price9Label;
    @FXML
    protected Label title1Label, title2Label, title3Label, title4Label, title5Label, title6Label, title7Label, title8Label, title9Label;

    @FXML
    protected Text description1Text, description2Text, description3Text, description4Text, description5Text, description6Text, description7Text, description8Text, description9Text;


    protected ArrayList<Item> items = new ArrayList<>(9);
    protected int itemsNb = 0;

    public UserController() {

    }

    protected ArrayList<ImageView> imageViewArrayList;
    protected ArrayList<Button> button1ArrayList;
    protected ArrayList<Button> button2ArrayList;
    protected ArrayList<Label> priceArrayList;
    protected ArrayList<Label> titleArrayList;
    protected ArrayList<Text> descriptionArrayList;


    public abstract void initialize();

    public abstract void goToHomePage() throws IOException;

    public void goToSignPage(ActionEvent event) throws IOException {
        CartItemsList.removeAllItems();
        Main m = new Main();
        m.changeScene("login-page.fxml");
    }

    protected abstract String getCategoryName();


    protected void loadImages() {
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadImage(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
    }

    protected void loadImage(Item item, Image img) {
        if (item.getCategory().equals(getCategoryName())) {
            int i = itemsNb;
            itemsNb++;
            activateStuff(i, imageViewArrayList.get(i), img, item, button1ArrayList.get(i), button2ArrayList.get(i), priceArrayList.get(i), titleArrayList.get(i), descriptionArrayList.get(i));
        }
    }

    protected void activateStuff(int i, ImageView imageView, Image img, Item item,
                                 Button button1, Button button2, Label price, Label title, Text description) {
        if (imageView != null) {
            imageView.setImage(img);
            imageView.setVisible(true);
        }
        if (button1 != null)
            button1.setVisible(true);
        if (button2 != null)
            button2.setVisible(true);
        if(price != null)
            price.setText(item.getPrice() + "RON");
        if(title != null)
            title.setText(item.getName() + " by " + item.getAuthor());
        if(description != null)
            description.setText(item.getDescription());
        items.add(i, item);
    }
}
