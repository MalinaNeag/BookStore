package com.example.bookstore.services;

import com.example.bookstore.model.Item;
import com.example.bookstore.model.ItemsList;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.image.Image;

import java.io.File;
import java.io.IOException;

public class AddItem {
    public static void addItem(String name, String price, String imgPath)  {
        ItemsList.addItem(new Item(name,price,imgPath));
        persistItems();
    }

    private static void persistItems() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("items.json"), ItemsList.getItems());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
