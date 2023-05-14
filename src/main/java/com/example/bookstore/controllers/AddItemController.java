package com.example.bookstore.controllers;

import com.example.bookstore.Main;
import com.example.bookstore.services.AddItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AddItemController implements Initializable {

    public AddItemController(){

    }

    List<String> firstFile;

    @FXML
    private Button viewNewOrders;

    @FXML
    private Button SignOut;

    @FXML
    private Button goToHome;

    @FXML
    private Button uploadImage;

    @FXML
    private TextField itemName;

    @FXML
    private TextField itemPrice;
    @FXML
    private TextField itemAuthor;

    @FXML
    private Button addItemButton;

    @FXML
    private Label wrongInput;

    @FXML
    private ChoiceBox<String> itemCategory;

    private String[] categories={"fantasy","crime","drama","self-improvement", "romance", "vintage"};

    private File f;
    private boolean imageUploaded=false;


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


    @FXML
    void uploadChosenImage(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        f = fc.showOpenDialog(null);


        File outputfile;
        try {
            BufferedImage bi = ImageIO.read(f);  // retrieve image
            //System.out.println(f.getName());
            outputfile = new File("images/" + itemCategory.getValue() + "/" + f.getName());
            ImageIO.write(bi, "png", outputfile);
            imageUploaded=true;
        } catch (IOException e) {
            wrongInput.setText("Please give an image!");
        }
    }
    public void addItemInList() throws IOException {
        if(itemName.getText().isEmpty()){
            wrongInput.setText("Please give a name!");
        }
        else if(itemAuthor.getText().isEmpty()){
            wrongInput.setText("Please give the author!");
        }
        else if(itemPrice.getText().isEmpty()){
            wrongInput.setText("Please give a price!");
        }
        else if(!imageUploaded){
            wrongInput.setText("Please give an image!");
        }
        else if(itemCategory.getValue()==null){
            wrongInput.setText("Please give a category!");
        }

        else {
            AddItem.addItem(itemName.getText(),itemPrice.getText(),f.getName(),itemCategory.getValue(), itemAuthor.getText());
            wrongInput.setText("Item added successfully");
            if(itemCategory.getValue().equals("fantasy")) {
                Main m = new Main();
                m.changeScene("fantasy-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("crime")) {
                Main m = new Main();
                m.changeScene("crime-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("drama")) {
                Main m = new Main();
                m.changeScene("drama-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("romance")) {
                Main m = new Main();
                m.changeScene("romance-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("self-improvement")) {
                Main m = new Main();
                m.changeScene("self_improvement-page-manager.fxml");
            }
            else if(itemCategory.getValue().equals("vintage")) {
                Main m = new Main();
                m.changeScene("vintage-page-manager.fxml");
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        itemCategory.getItems().addAll(categories);
        firstFile = new ArrayList<>();
        firstFile.add("*.jpg");
        firstFile.add("*.png");
        firstFile.add("*.jpeg");
    }

}
