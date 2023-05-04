package com.example.bookstore.services;

import com.example.bookstore.exceptions.UsernameAlreadyExistsException;
import com.example.bookstore.model.User;

import java.io.File;
import java.io.IOException;

import com.example.bookstore.model.UsersList;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Register {

    public static void addUser(String username, String password, String role) throws UsernameAlreadyExistsException {
        UsersList.addUser(new User(username, password, role));
        persistUsers();
    }

    private static void persistUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("users.json"), UsersList.getUsers());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
