package com.example.pizza.orders.product.fries;

import com.example.pizza.orders.product.Product;

public class Fries extends Product {

    private String size;
    private String sauce;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String getFullName() {
            return "Картофель фри " + size + " Соус " + sauce;
    }

}
