package com.example.pizza.controllers;

import com.example.pizza.orders.Order;
import com.example.pizza.orders.Orders;
import com.example.pizza.orders.product.Product;
import com.example.pizza.orders.product.beer.BeerBuilder;
import com.example.pizza.orders.product.burger.BurgerBuilder;
import com.example.pizza.orders.product.drink.KvassBuilder;
import com.example.pizza.orders.product.drink.LemonadeBuilder;
import com.example.pizza.orders.product.fries.FriesBuilder;
import com.example.pizza.orders.product.pizza.PizzaBuilder;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class OrderWindowController {
    @FXML
    private ChoiceBox<String> productBox;
    @FXML
    private ChoiceBox<String> firstOptBox;
    @FXML
    private ChoiceBox<String> secondOptBox;
    @FXML
    private ChoiceBox<String> thirdOptBox;
    @FXML
    private ChoiceBox<String> fourOptBox;
    @FXML
    private Label firstOptLabel;
    @FXML
    private Label secondOptLabel;
    @FXML
    private Label thirdOptLabel;
    @FXML
    private Label fourOptLabel;
    @FXML
    private TextField numberField;
    @FXML
    private ListView<String> listView;
    private ArrayList<Product> products = new ArrayList<>();

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

        productBox.setOnAction(event -> {
            switch (productBox.getValue()) {
                case "??????????" -> setPizza();
                case "??????????????" -> setLemonade();
                case "????????" -> setKvass();
                case "????????" -> setBeer();
                case "?????????????????? ??????" -> setFries();
                case "????????????" -> setBurger();
            }
        });



        setProductBox();

    }

    public void clearBox() {
        firstOptBox.getItems().clear();
        secondOptBox.getItems().clear();
        thirdOptBox.getItems().clear();
        fourOptBox.getItems().clear();
    }

    public void setProductBox() {
        productBox.getItems().clear();
        String[] products = {"??????????", "??????????????", "????????", "????????", "?????????????????? ??????", "????????????"};
        productBox.getItems().addAll(products);
        productBox.setValue("??????????");
    }

    public void setBurger() {
        clearBox();

        firstOptLabel.setText("????????");
        firstOptLabel.setVisible(true);

        String[] sorts = {"??????????????????", "????????????", "????????????"};
        firstOptBox.getItems().addAll(sorts);
        firstOptBox.setValue("??????????????????");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("??????");
        secondOptLabel.setVisible(true);

        String[] type = {"??????????????", "??????????????", "??????????????"};
        secondOptBox.getItems().addAll(type);
        secondOptBox.setValue("??????????????");
        secondOptBox.setVisible(true);


        thirdOptLabel.setText("????????");
        thirdOptLabel.setVisible(true);

        String[] doughs = {"????????", "????????????"};
        thirdOptBox.getItems().addAll(doughs);
        thirdOptBox.setValue("????????????");
        thirdOptBox.setVisible(true);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setPizza() {
        clearBox();

        firstOptLabel.setText("????????");
        firstOptLabel.setVisible(true);

        String[] sorts = {"????????????????", "??????????????????", "??????????????????", "3 ????????"};
        firstOptBox.getItems().addAll(sorts);
        firstOptBox.setValue("????????????????");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("??????????????");
        secondOptLabel.setVisible(true);

        String[] diameters = {"20 ????", "26 ????", "30 ????"};
        secondOptBox.getItems().addAll(diameters);
        secondOptBox.setValue("26 ????");
        secondOptBox.setVisible(true);


        thirdOptLabel.setText("??????????");
        thirdOptLabel.setVisible(true);

        String[] doughs = {"????????????", "????????????????????????"};
        thirdOptBox.getItems().addAll(doughs);
        thirdOptBox.setValue("????????????????????????");
        thirdOptBox.setVisible(true);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setBeer() {
        clearBox();

        firstOptLabel.setText("??????????");
        firstOptLabel.setVisible(true);

        String[] brands = {"????????????????", "????????????????", "???????????????????????????????? ??????????????????", "Salden's"};
        firstOptBox.getItems().addAll(brands);
        firstOptBox.setValue("????????????????");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("????????");
        secondOptLabel.setVisible(true);

        String[] sorts = {"??????????", "????????????", " ??????????", "IPA", "????????????????????", "??????????????"};
        secondOptBox.getItems().addAll(sorts);
        secondOptBox.setValue("??????????");
        secondOptBox.setVisible(true);


        thirdOptLabel.setText("????????");
        thirdOptLabel.setVisible(true);

        String[] tara = {"????????????", "????????????????"};
        thirdOptBox.getItems().addAll(tara);
        thirdOptBox.setValue("????????????");
        thirdOptBox.setVisible(true);


        fourOptLabel.setText("??????????");
        fourOptLabel.setVisible(true);

        String[] volume = {"0.33 ??", "0.66 ??", "1.66 ??"};
        fourOptBox.getItems().addAll(volume);
        fourOptBox.setValue("0.33 ??");
        fourOptBox.setVisible(true);

    }

    public void setKvass() {
        clearBox();

        firstOptLabel.setText("??????????");
        firstOptLabel.setVisible(true);

        String[] volume = {"0.3 ??", "0.5 ??", "1 ??", "1.5 ??", "2 ??"};
        firstOptBox.getItems().addAll(volume);
        firstOptBox.setValue("1 ??");
        firstOptBox.setVisible(true);

        secondOptLabel.setVisible(false);
        secondOptBox.setVisible(false);

        thirdOptLabel.setVisible(false);
        thirdOptBox.setVisible(false);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setLemonade() {
        firstOptLabel.setText("????????");
        firstOptLabel.setVisible(true);

        String[] taste = {"????????????????", "????????????????", "??????????????"};
        firstOptBox.getItems().addAll(taste);
        firstOptBox.setValue("????????????????");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("??????????");
        secondOptLabel.setVisible(true);

        String[] volume = {"0.3 ??", "0.5 ??", "1 ??", "1.5 ??", "2 ??"};
        secondOptBox.getItems().addAll(volume);
        secondOptBox.setValue("1 ??");
        secondOptBox.setVisible(true);


        thirdOptLabel.setVisible(false);
        thirdOptBox.setVisible(false);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setFries() {
        clearBox();

        firstOptLabel.setText("????????????");
        firstOptLabel.setVisible(true);


        String[] size = {"??????????", "??????????????????????", "??????????????"};
        firstOptBox.getItems().addAll(size);
        firstOptBox.setValue("??????????????????????");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("????????");
        secondOptLabel.setVisible(true);

        String[] sauce = {"100 ????????????", "??????????????????", "????????????????", "??????????-????????????"};
        secondOptBox.getItems().addAll(sauce);
        secondOptBox.setValue("??????????????");
        secondOptBox.setVisible(true);

        thirdOptLabel.setVisible(false);
        thirdOptBox.setVisible(false);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
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
        Product product = null;
        switch (productBox.getValue()) {
            case "??????????" -> product = new PizzaBuilder().
                    withSort(firstOptBox.getValue()).
                    withSize(secondOptBox.getValue()).
                    withDough(thirdOptBox.getValue()).build();
            case "??????????????" -> product = new LemonadeBuilder().
                    withTaste(firstOptBox.getValue()).
                    withVolume(secondOptBox.getValue()).build();
            case "????????" -> product = new KvassBuilder().
                    withVolume(firstOptBox.getValue()).build();
            case "????????" -> product = new BeerBuilder().
                    withBrand(firstOptBox.getValue()).
                    withSort(secondOptBox.getValue()).
                    withTara(thirdOptBox.getValue()).
                    withVolume(fourOptBox.getValue()).build();
            case "?????????????????? ??????" -> product = new FriesBuilder().
                    withSize(firstOptBox.getValue()).
                    withSauce(secondOptBox.getValue()).build();
            case "????????????" -> product = new BurgerBuilder().
                    withSort(firstOptBox.getValue()).
                    withType(secondOptBox.getValue()).
                    withSauce(thirdOptBox.getValue()).build();
        }

        if (product != null) {
            for (int i = 0; i < Integer.parseInt(numberField.getText()); i++) {
                products.add(product);
            }
        }
        setListView();

        numberField.replaceText(0, numberField.getText().length(), Integer.toString(1));

    }

    @FXML
    void addOrder(ActionEvent event) {

        if (products.size()!=0){

            Orders.getInstance().getOrders().add(new Order(products));
        }

        Stage stage = (Stage) listView.getScene().getWindow();
        stage.close();

    }

    void setListView() {
        ArrayList<String> strings = new ArrayList<>();
        int i = 1;
        for (Product product : products) {
            strings.add(i + ". " + product.getFullName());
            i++;
        }
        ObservableList<String> stringsFX = FXCollections.observableArrayList(strings);
        listView.setItems(stringsFX);
    }

}
