package com.example.foodapp.model;

public class Product {

    private int image;
    private String price, pName;

    public Product(int image, String price, String pName) {
        this.image = image;
        this.price = price;
        this.pName = pName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
