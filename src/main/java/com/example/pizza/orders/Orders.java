package com.example.pizza.orders;

import java.util.ArrayList;

public class Orders {

    private static Orders instance;
    private ArrayList<Order> orders;
    private ArrayList<Order> deletedOrders;


    public ArrayList<Order> getDeletedOrders() {
        return deletedOrders;
    }

    public void setDeletedOrders(ArrayList<Order> deletedOrders) {
        this.deletedOrders = deletedOrders;
    }

    private Orders() {
        orders = new ArrayList<>();
        deletedOrders = new ArrayList<>();
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
