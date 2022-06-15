package com.example.pizza;

import com.example.pizza.product.Product;

import java.util.ArrayList;

public class Order {

    int number;
    ArrayList<Product> products;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
