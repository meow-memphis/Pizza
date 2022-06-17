package com.example.pizza;

import com.example.pizza.product.Product;
import com.example.pizza.product.beer.Beer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainWindowController {

    //    checkBtn.setVisible(false);
    Orders ordersClass = Orders.getInstance();

    public void initializeTree() {

        TreeItem<String> root = new TreeItem<>("Заказы");
        root.setExpanded(true);

        for (Order order : ordersClass.getOrders()) {

            TreeItem<String> orderItem = new TreeItem<>("Заказ " + order.getNumber());
            root.getChildren().add(orderItem);

            ArrayList<Product> products = order.getProducts();

            for (Product product : products) {

                TreeItem<String> productItem = new TreeItem<>(product.getFullName());
                orderItem.getChildren().add(productItem);

                // Дописать листья с типами конкретными
                // Дописать готовность
                // Дописать при повторении продуктов не добавление, а плюсование в счетчик

            }


        }

        tree.setRoot(root);
    }

    @FXML
    private TreeView<String> tree;

    @FXML
    private Button checkBtn;

    @FXML
    void addOrder(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("order_window.fxml"));
            Scene Scene = new Scene(fxmlLoader.load());
            Stage orderStage = new Stage();
            orderStage.setTitle("New order");
            orderStage.setScene(Scene);
            orderStage.initModality(Modality.APPLICATION_MODAL);
            orderStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void checkReady(ActionEvent event) {

    }

    @FXML
    void sendOrder(ActionEvent event) {

    }


}
