package com.example.pizza.orders.product.fries;

import com.example.pizza.orders.product.Product;

public class Fries extends Product {

    private static final String[] sizes = {"Малый", "Стандартный", "Большой"};

    public static String[] getSizes() {
        return sizes;
    }

    public static String[] getSauces() {
        return sauces;
    }

    private static final String[] sauces = {"100 Остров", "Горчичный", "Баребекю", "Кисло-острый"};


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
