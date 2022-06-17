package com.example.pizza;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OrderWindowController {

    @FXML
    private ChoiceBox<?> productBox;
    @FXML
    private ChoiceBox<?> firstOptBox;

    @FXML
    private ChoiceBox<?> secondOptBox;

    @FXML
    private ChoiceBox<?> thirdOptBox;

    @FXML
    private ChoiceBox<?> fourOptBox;

    @FXML
    private TextField numberField;

    @FXML
    private ListView<?> listView;

    public void initialize() {
        numberField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    numberField.setText(newValue.replaceAll("[^\\d]", ""));
                }

                if (numberField.getText().equals("0")) {
                    String number = numberField.getText();
                    numberField.replaceText(0, number.length(), "1");
                } else if (numberField.getText().equals("")) {
                    numberField.replaceText(0, 0, "1");
                }

            }
        });


    }

    @FXML
    void minusNumber(ActionEvent event) {
        if (!numberField.getText().equals("1")) {
            String number = numberField.getText();
            numberField.replaceText(0, number.length(), Integer.toString(Integer.parseInt(number) - 1));
        }
    }

    @FXML
    void plusNumber(ActionEvent event) {
        String number = numberField.getText();
        if (!number.equals("")) {
            numberField.replaceText(0, number.length(), Integer.toString(Integer.parseInt(number) + 1));
        } else {
            numberField.replaceText(0, 0, "1");
        }
    }

    @FXML
    void addProduct(ActionEvent event) {

    }

    @FXML
    void addOrder(ActionEvent event) {

        Stage stage = (Stage) listView.getScene().getWindow();
        stage.close();
    }

}
