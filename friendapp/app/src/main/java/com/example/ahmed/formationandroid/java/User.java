package com.example.ahmed.formationandroid.java;

/**
 * Created by ahmed on 10/11/2017.
 */

public class User {
    private String name,lastName;
    private int phoneNumber;
    private int image;

    public User(String name, String lastName, int phoneNumber, int image) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
