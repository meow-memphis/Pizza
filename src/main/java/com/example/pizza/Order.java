package com.example.pizza;

import com.example.pizza.product.Product;

import java.util.ArrayList;

public class Order {

    static private int number = 0;
    private ArrayList<Product> products;

    private boolean isReady = false;

    public Order() {
        number++;
    }

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
        System.out.println(this.getProducts());
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
