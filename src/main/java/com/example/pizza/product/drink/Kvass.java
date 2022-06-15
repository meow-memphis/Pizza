package com.example.pizza.product.drink;

import com.example.pizza.product.Product;

public class Kvass extends Product {

    String type;
    String volume;

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
}
