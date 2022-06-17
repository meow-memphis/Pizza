package com.example.pizza.orders;

import com.example.pizza.orders.product.Product;

import java.util.ArrayList;

public class Order {

    private static int count = 1;
    private int id = 1;
    private ArrayList<Product> products;

    private boolean isReady = false;

    public boolean isReady() {
        return isReady;
    }

    public void calcReady() {
        isReady = true;
        for (Product product: products) {
            if (!product.isReady()) {
                isReady = false;
            }
        }
    }

    public Order(ArrayList<Product> products) {
        this.products = products;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
