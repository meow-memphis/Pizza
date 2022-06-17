package com.example.pizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OrderWindowController {

    @FXML
    private ChoiceBox<?> firstOptBox;

    @FXML
    private ChoiceBox<?> fourOptBox;

    @FXML
    private ListView<?> listView;

    @FXML
    private Button minusBut;

    @FXML
    private TextField numberField;

    @FXML
    private Button plusBut;

    @FXML
    private ChoiceBox<?> productBox;

    @FXML
    private ChoiceBox<?> secondOptBox;

    @FXML
    private ChoiceBox<?> thirdOptBox;

    @FXML
    void addProduct(ActionEvent event) {

    }

    @FXML
    void addOrder(ActionEvent event) {

        Stage stage = (Stage) plusBut.getScene().getWindow();
        stage.close();
    }

}
