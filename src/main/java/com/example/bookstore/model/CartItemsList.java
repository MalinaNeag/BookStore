package com.example.bookstore.model;

import java.util.ArrayList;

public class CartItemsList {
    private static ArrayList<Item>cartItemsList = new ArrayList<>(5);

    public static void add(Item newItem){
        if(cartItemsList.size()<5) {
            cartItemsList.add(newItem);
        }
    }

    public static void removeAllItems(){
        cartItemsList=new ArrayList<>(5);
    }

    public static String getIdOfItem(int index){
        return cartItemsList.get(index).getName().toString();
    }

    public static String getDetails1(int index){
        return cartItemsList.get(index).getPrice().toString()+" RON "+"    ";
    }
    public static int getPriceItems(int index){
        int price_new;
        price_new=Integer.parseInt(cartItemsList.get(index).getPrice());
        return price_new;
    }
    public static void clear(){
        cartItemsList.clear();
    }
    @Override
    public  String toString() {
        return cartItemsList.toString();
    }
    public static ArrayList<Item> getItems() {
        return cartItemsList;
    }
}
