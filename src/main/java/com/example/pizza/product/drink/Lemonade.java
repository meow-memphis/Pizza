package com.example.pizza.product.drink;

public class Lemonade extends Kvass {

    private String taste;

    public Lemonade() {
        type = "Лимонад";
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String getFullName() {
        return type + " " + taste + " " + volume;
    }
}
