package com.example.bookstore.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javafx.embed.swing.SwingFXUtils;

public class ItemsList {
    private static ArrayList<Item> items = new ArrayList<>(36);
    private static ArrayList<Image> images = new ArrayList<>(36);
    private static int fantasyNo;
    private static int crimeNo;
    private static int dramaNo;
    private static int romanceNo;
    private static int selfNo;
    private static int vintageNo;

    public ItemsList() {
        fantasyNo = 0;
        crimeNo = 0;
        dramaNo = 0;
        romanceNo = 0;
        selfNo = 0;
        vintageNo = 0;
    }

    public static void decreaseCategoryNo(String category){
        if(category.equals("crime") && crimeNo!=0)
            crimeNo--;
        else if(category.equals("fantasy") && fantasyNo!=0)
            fantasyNo--;
        else if(category.equals("drama") && dramaNo!=0)
            dramaNo--;
        else if(category.equals("romance") && romanceNo!=0)
            romanceNo--;
        else if(category.equals("self") && selfNo!=0)
            selfNo--;
        else if(category.equals("vintage") && vintageNo!=0)
            vintageNo--;
    }

    private static Image readImage(String path) {
        BufferedImage bf = null;
        try {
            bf = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SwingFXUtils.toFXImage(bf, null);
    }

    public static void addItem(Item newItem) throws IOException {
        Image image = readImage(newItem.getImgPath());
        if (newItem.getCategory().equals("fantasy") && fantasyNo<9) {
            fantasyNo = fantasyNo + 1;
            items.add(newItem);
            images.add(image);
        }
        else if (newItem.getCategory().equals("crime") && crimeNo<9) {
            crimeNo = crimeNo + 1;
            items.add(newItem);
            images.add(image);
        }
        else if (newItem.getCategory().equals("romance") && romanceNo <9) {
            romanceNo = romanceNo + 1;
            items.add(newItem);
            images.add(image);
        }
        else if (newItem.getCategory().equals("drama") && dramaNo <9) {
            dramaNo = dramaNo + 1;
            items.add(newItem);
            images.add(image);
        }
        else if (newItem.getCategory().equals("self-improvement") && selfNo <9) {
            selfNo = selfNo + 1;
            items.add(newItem);
            images.add(image);
        }
        else if (newItem.getCategory().equals("vintage") && vintageNo <9) {
            vintageNo = vintageNo + 1;
            items.add(newItem);
            images.add(image);
        }
    }


    public static void loadItemsFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //read items from json
        try {
            items = objectMapper.readValue(Paths.get("items.json").toFile(), new TypeReference<>() {});
        } catch (JsonParseException e) {

            e.printStackTrace();
        }

        //also load the images from the json file
        for (Item auxItem : items) {
            Image image = readImage(auxItem.getImgPath());

            if (auxItem.getCategory().equals("fantasy")) {
                if(fantasyNo < 9) {
                    fantasyNo = fantasyNo + 1;
                    images.add(image);
                }
            }
            else if (auxItem.getCategory().equals("crime")) {
                if(crimeNo < 9) {
                    crimeNo = crimeNo + 1;
                    images.add(image);
                }
            }
            else if (auxItem.getCategory().equals("romance")) {
                if(romanceNo < 9) {
                    romanceNo = romanceNo + 1;
                    images.add(image);
                }
            }
            else if (auxItem.getCategory().equals("drama")) {
                if(dramaNo < 9) {
                    dramaNo = dramaNo + 1;
                    images.add(image);
                }
            }
            else if (auxItem.getCategory().equals("self-improvement")) {
                if(selfNo < 9) {
                    selfNo = selfNo + 1;
                    images.add(image);
                }
            }
            else if (auxItem.getCategory().equals("vintage")) {
                if(vintageNo < 9) {
                    vintageNo = vintageNo + 1;
                    images.add(image);
                }
            }
        }
    }


    @Override
    public String toString() {
        return items.toString();
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static ArrayList<Image> getImages() {
        return images;
    }
}
