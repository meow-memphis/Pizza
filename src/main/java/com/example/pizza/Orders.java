package com.example.pizza;

import java.util.ArrayList;

public class Orders {

    private static Orders instance;
    private ArrayList<Order> orders;

    private Orders() {
        orders = new ArrayList<>();
    }

    public static Orders getInstance() {
        if (instance == null) {
            instance = new Orders();
        }
        return instance;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

}
