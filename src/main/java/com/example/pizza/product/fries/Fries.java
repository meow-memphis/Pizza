package com.example.pizza.product.fries;

import com.example.pizza.product.Product;

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
        if (sauce != null) {
            return "Картофель фри " + size + ". Соус " + sauce;
        } else {
            return "Картофель фри " + size;
        }
    }

}
