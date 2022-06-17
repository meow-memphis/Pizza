package com.example.pizza.controllers;

import com.example.pizza.orders.Order;
import com.example.pizza.orders.Orders;
import com.example.pizza.orders.product.Product;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.ArrayList;

public class SendOrdersWindowController {

    @FXML
    private TreeView<String> treeSendOrders;

    public void initialize() {

        TreeItem<String> root = new TreeItem<>("Отправленные Заказы");

        for (Order order : Orders.getInstance().getDeletedOrders()) {

            if (order != null) {

                TreeItem<String> orderItem = new TreeItem<>("Заказ " + order.getId());
                root.getChildren().add(orderItem);
                orderItem.setExpanded(true);

                ArrayList<Product> products = order.getProducts();
                for (Product product : products) {
                    TreeItem<String> productItem = new TreeItem<>(product.getFullName());
                    orderItem.getChildren().add(productItem);
                }
            }
        }

        treeSendOrders.setRoot(root);
        treeSendOrders.setShowRoot(false);
    }
}
