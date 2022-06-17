package com.example.pizza.orders.product;

public abstract class Product {


    private boolean isReady = false;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public abstract String getFullName();
}
