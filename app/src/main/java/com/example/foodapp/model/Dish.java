package com.example.foodapp.model;

public class Dish {

    private String dishName;
    private int imgResource;

    public Dish(String dishName, int imgResource) {
        this.dishName = dishName;
        this.imgResource = imgResource;
    }

    public Dish() {
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
