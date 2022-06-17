package com.example.pizza.orders.product.burger;

import com.example.pizza.orders.product.Product;

public class Burger extends Product {

    private static final String[] sorts = {"Чизбургер", "Бургер", "БигМак"};
    private static final String[] types = {"Обычный", "Двойной", "Тройной"};
    private static final String[] sauces = {"Чили", "Кетчуп"};
    
    
    private String sort;
    private String type;

    public static String[] getSorts() {
        return sorts;
    }

    public static String[] getTypes() {
        return types;
    }

    public static String[] getSauces() {
        return sauces;
    }

    private String sauce;


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String getFullName() {
        return sort + " " + type + " " + sauce;
    }
}
