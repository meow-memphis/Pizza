package com.example.pizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    @FXML
    private TreeView<String> tree;

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
        } catch (Exception e){
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
