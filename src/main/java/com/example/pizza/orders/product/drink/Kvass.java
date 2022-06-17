package com.example.pizza.orders.product.drink;

import com.example.pizza.orders.product.Product;

public class Kvass extends Product {

    protected static final String[] volumes = {"0.3 л", "0.5 л", "1 л", "1.5 л", "2 л"};

    protected String type;

    public static String[] getVolumes() {
        return volumes;
    }

    protected String volume;

    public Kvass() {
        type = "Квас";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String getFullName() {
        return type + " " + volume;
    }
}
