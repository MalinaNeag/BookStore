package com.example.bookstore.model;

import javafx.scene.image.Image;

public class Item {
    private String name;
    private String price;
    private String imgPath;
    private String category;
    private String author;

    public Item(){

    }

    public Item(String name, String price, String imgPath,String category, String author) {
        this.name = name;
        this.price = price;
        this.imgPath = imgPath;
        this.category = category;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String path) {
        this.price = path;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getPrice() {
        return price;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
