package com.example.pizza.orders.product.drink;

public class Lemonade extends Kvass {

    public static String[] getTastes() {
        return tastes;
    }

    private static final String[] tastes = {"Брусника", "Мандарин", "Авокадо"};
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
