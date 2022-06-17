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
import java.util.Random;

public class MainWindowController {

    public void initialize() {
        initializeTree();
    }

    public void initializeTree() {

        TreeItem<String> root = new TreeItem<>("Заказы");

        for (Order order : Orders.getInstance().getOrders()) {

            if (order != null) {

                TreeItem<String> orderItem = new TreeItem<>((order.isReady()) ?
                        "Заказ " + order.getNumber() + " - Готов" :
                        "Заказ " + order.getNumber() + " --- Не готов");
                root.getChildren().add(orderItem);
                orderItem.setExpanded(true);

                ArrayList<Product> products = order.getProducts();

                for (Product product : products) {

                    TreeItem<String> productItem = new TreeItem<>((product.isReady()) ?
                            product.getFullName() + " - Готов" :
                            product.getFullName() + " --- Не готов");
                    orderItem.getChildren().add(productItem);

                }
            }

        }

        tree.setRoot(root);
        tree.setShowRoot(false);
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

        for (Order order : Orders.getInstance().getOrders()) {

            for (Product product: order.getProducts()) {

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

    }


}
