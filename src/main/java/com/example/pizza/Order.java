package com.example.pizza;

import com.example.pizza.product.Product;

import java.util.ArrayList;

public class Order {

    static private int number = 0;
    private ArrayList<Product> products;

    public Order() {
        number++;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
