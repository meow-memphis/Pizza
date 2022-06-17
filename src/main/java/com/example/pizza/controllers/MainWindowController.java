package com.example.pizza.controllers;

import com.example.pizza.Application;
import com.example.pizza.orders.Order;
import com.example.pizza.orders.Orders;
import com.example.pizza.orders.product.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class MainWindowController {

    @FXML
    private TreeView<String> tree;

    public void initialize() {
        initializeTree();
    }

    public void initializeTree() {

        TreeItem<String> root = new TreeItem<>("Заказы");

        for (Order order : Orders.getInstance().getOrders()) {

            if (order != null) {

                TreeItem<String> orderItem = new TreeItem<>((order.isReady()) ?
                        "+++ Заказ " + order.getId() + " +++ Собран" :
                        "Заказ " + order.getId() + " --- Не собран");
                root.getChildren().add(orderItem);
                orderItem.setExpanded(true);

                ArrayList<Product> products = order.getProducts();
                for (Product product : products) {

                    TreeItem<String> productItem = new TreeItem<>((product.isReady()) ?
                            "+ " + product.getFullName() + " + Готов" :
                            product.getFullName() + " --- Не готов");
                    orderItem.getChildren().add(productItem);
                }
            }
        }

        tree.setRoot(root);
        tree.setShowRoot(false);
    }

    @FXML
    void addOrder(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("order_window.fxml"));
            Scene Scene = new Scene(fxmlLoader.load());
            Stage orderStage = new Stage();
            orderStage.setTitle("Новый заказ");
            orderStage.setScene(Scene);
            orderStage.initModality(Modality.APPLICATION_MODAL);
            orderStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initializeTree();
    }

    @FXML
    void checkReady(ActionEvent event) {
        for (Order order : Orders.getInstance().getOrders()) {

            for (Product product : order.getProducts()) {

                if (!product.isReady()) {

                    Random random = new Random();
                    int num = random.nextInt(10);
                    if (num < 2) {
                        product.setReady(true);
                    }
                }
            }
            order.calcReady();
        }
        initializeTree();
    }

    @FXML
    void showTree(ActionEvent event) {
        initializeTree();
    }

    @FXML
    void sendOrder(ActionEvent event) {

        TreeItem c = (TreeItem) tree.getSelectionModel().getSelectedItem();

        if (c!=null) {

            if (c.getValue().toString().contains("+++")) {

                int numberOrder = Integer.parseInt(c.getValue().toString().replaceAll("[^0-9]", ""));

                for (Order order : Orders.getInstance().getOrders()) {
                    if (order.getId() == numberOrder) {
                        Orders.getInstance().getDeletedOrders().add(order);
                    }
                }

                c.getParent().getChildren().remove(c);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Можно отправить только собранные заказы");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void showSendOrders(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("send_orders_window.fxml"));
            Scene Scene = new Scene(fxmlLoader.load());
            Stage orderStage = new Stage();
            orderStage.setTitle("Отправленные заказы");
            orderStage.setScene(Scene);
            orderStage.initModality(Modality.APPLICATION_MODAL);
            orderStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
