package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.io.InputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.ItemsList;
import com.example.bookstore.services.AddItem;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class RomanceBookPageManagerController {

    @FXML
    private Button viewNewOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

    @FXML
    private Button edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9;

    @FXML
    private Button delete1,delete2,delete3,delete4,delete5,delete6,delete7,delete8,delete9;

    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;
    @FXML
    private ImageView image9;

    ArrayList<Item> romanceBooks = new ArrayList<>(9);
    private int romanceNo = 0;

    public RomanceBookPageManagerController() {
    }

    public void initialize(){
        loadImages();
    }

    public void goToHomePage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("home-page-manager.fxml");
    }

    public void goToNewOrdersPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("new-orders-page.fxml");
    }

    public void goToSignPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("login-page.fxml");
    }

    public void goToAddItemPage(ActionEvent event) throws IOException {
        Main m= new Main();
        m.changeScene("add-item-page.fxml");
    }

    private void deleteItem(int index)throws IOException{
        ItemsList.getItems().remove(romanceBooks.get(index));
        romanceBooks.remove(index);
        romanceNo = 0;
        ItemsList.decreaseCategoryNo("romance");
        Main m = new Main();
        m.changeScene("romance-page-manager.fxml");
        loadImages();
        AddItem.persistItems();
    }

    public void deleteItem1() throws IOException {
        ItemsList.getImages().remove(image1.getImage());
        deleteItem(0);
    }

    public void deleteItem2() throws IOException {
        ItemsList.getImages().remove(image2.getImage());
        deleteItem(1);
    }

    public void deleteItem3() throws IOException {
        ItemsList.getImages().remove(image3.getImage());
        deleteItem(2);
    }

    public void deleteItem4() throws IOException {
        ItemsList.getImages().remove(image4.getImage());
        deleteItem(3);
    }

    public void deleteItem5() throws IOException {
        ItemsList.getImages().remove(image5.getImage());
        deleteItem(4);
    }

    public void deleteItem6() throws IOException {
        ItemsList.getImages().remove(image6.getImage());
        deleteItem(5);
    }

    public void deleteItem7() throws IOException {
        ItemsList.getImages().remove(image7.getImage());
        deleteItem(6);
    }

    public void deleteItem8() throws IOException {
        ItemsList.getImages().remove(image8.getImage());
        deleteItem(7);
    }

    public void deleteItem9() throws IOException {
        ItemsList.getImages().remove(image9.getImage());
        deleteItem(8);
    }

    public void editItem(){

    }
    /*private static DramaBookPageManagerController instance = null;

    public static DramaBookPageManagerController getInstance() {
        return instance;
    }*/



    private void loadImages(){
        int l = ItemsList.getImages().size();
        for (int i = 0; i < l; i++)
            loadImage(ItemsList.getItems().get(i), ItemsList.getImages().get(i));
    }

    public void loadImage(Item item, Image img){
        if(item.getCategory().equals("romance")) {
            romanceNo++;
            switch(romanceNo){
                case 1: image1.setImage(img);
                    delete1.setVisible(true);
                    romanceBooks.add(0,item);
                    break;
                case 2: image2.setImage(img);
                    delete2.setVisible(true);
                    romanceBooks.add(1,item);
                    break;
                case 3: image3.setImage(img);
                    delete3.setVisible(true);
                    romanceBooks.add(2,item);
                    break;
                case 4: image4.setImage(img);
                    delete4.setVisible(true);
                    romanceBooks.add(3,item);
                    break;
                case 5: image5.setImage(img);
                    delete5.setVisible(true);
                    romanceBooks.add(4,item);
                    break;
                case 6: image6.setImage(img);
                    delete6.setVisible(true);
                    romanceBooks.add(5,item);
                    break;
                case 7: image7.setImage(img);
                    delete7.setVisible(true);
                    romanceBooks.add(6,item);
                    break;
                case 8: image8.setImage(img);
                    delete8.setVisible(true);
                    romanceBooks.add(7,item);
                    break;
                case 9: image9.setImage(img);
                    delete9.setVisible(true);
                    romanceBooks.add(8,item);
                    break;
                default: throw new NullPointerException();
            }
        }
    }

}
