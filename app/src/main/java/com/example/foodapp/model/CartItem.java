package com.example.foodapp.model;

public class CartItem {

    private int cart_number;
    private String cart_name;
    private int cart_count;
    private int cart_total;

    public CartItem() {
    }

    public CartItem(int cart_number, String cart_name, int cart_count, int cart_total) {
        this.cart_number = cart_number;
        this.cart_name = cart_name;
        this.cart_count = cart_count;
        this.cart_total = cart_total;
    }

    public int getCart_number() {
        return cart_number;
    }

    public void setCart_number(int cart_number) {
        this.cart_number = cart_number;
    }

    public String getCart_name() {
        return cart_name;
    }

    public void setCart_name(String cart_name) {
        this.cart_name = cart_name;
    }

    public int getCart_cout() {
        return cart_count;
    }

    public void setCart_cout(int cart_cout) {
        this.cart_count = cart_cout;
    }

    public int getCart_total() {
        return cart_total;
    }

    public void setCart_total(int cart_total) {
        this.cart_total = cart_total;
    }
}
