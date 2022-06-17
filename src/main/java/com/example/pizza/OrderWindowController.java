package com.example.pizza;

import com.example.pizza.product.Product;
import com.example.pizza.product.beer.BeerBuilder;
import com.example.pizza.product.drink.KvassBuilder;
import com.example.pizza.product.drink.LemonadeBuilder;
import com.example.pizza.product.fries.FriesBuilder;
import com.example.pizza.product.pizza.Pizza;
import com.example.pizza.product.pizza.PizzaBuilder;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
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
                case "Пицца" -> setPizza();
                case "Лимонад" -> setLemonade();
                case "Квас" -> setKvass();
                case "Пиво" -> setBeer();
                case "Картофель фри" -> setFries();
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
        String[] products = {"Пицца", "Лимонад", "Квас", "Пиво", "Картофель фри"};
        productBox.getItems().addAll(products);
        productBox.setValue("Пицца");
    }

    public void setPizza() {
        clearBox();

        firstOptLabel.setText("Сорт");
        firstOptLabel.setVisible(true);

        String[] sorts = {"Пеперони", "Маргарита", "Гавайская", "3 сыра"};
        firstOptBox.getItems().addAll(sorts);
        firstOptBox.setValue("Пеперони");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("Диаметр");
        secondOptLabel.setVisible(true);

        String[] diameters = {"20 см", "26 см", "30 см"};
        secondOptBox.getItems().addAll(diameters);
        secondOptBox.setValue("26 см");
        secondOptBox.setVisible(true);


        thirdOptLabel.setText("Тесто");
        thirdOptLabel.setVisible(true);

        String[] doughs = {"Тонкое", "Классическое"};
        thirdOptBox.getItems().addAll(doughs);
        thirdOptBox.setValue("Классическое");
        thirdOptBox.setVisible(true);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setBeer() {
        clearBox();

        firstOptLabel.setText("Марка");
        firstOptLabel.setVisible(true);

        String[] brands = {"Афанасий", "Хайникен", "Василеостровская пивоварня", "Salden's"};
        firstOptBox.getItems().addAll(brands);
        firstOptBox.setValue("Хайникен");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("Сорт");
        secondOptLabel.setVisible(true);

        String[] sorts = {"Лагер", "Портер", " Стаут", "IPA", "Барлейвайн", "Вайсбир"};
        secondOptBox.getItems().addAll(sorts);
        secondOptBox.setValue("Лагер");
        secondOptBox.setVisible(true);


        thirdOptLabel.setText("Тара");
        thirdOptLabel.setVisible(true);

        String[] tara = {"Стекло", "Алюминий"};
        thirdOptBox.getItems().addAll(tara);
        thirdOptBox.setValue("Стекло");
        thirdOptBox.setVisible(true);


        fourOptLabel.setText("Объем");
        fourOptLabel.setVisible(true);

        String[] volume = {"0.33 л", "0.66 л", "1.66 л"};
        fourOptBox.getItems().addAll(volume);
        fourOptBox.setValue("0.33 л");
        fourOptBox.setVisible(true);

    }

    public void setKvass() {
        clearBox();

        firstOptLabel.setText("Объем");
        firstOptLabel.setVisible(true);

        String[] volume = {"0.3 л", "0.5 л", "1 л", "1.5 л", "2 л"};
        firstOptBox.getItems().addAll(volume);
        firstOptBox.setValue("1 л");
        firstOptBox.setVisible(true);

        secondOptLabel.setVisible(false);
        secondOptBox.setVisible(false);

        thirdOptLabel.setVisible(false);
        thirdOptBox.setVisible(false);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setLemonade() {
        firstOptLabel.setText("Вкус");
        firstOptLabel.setVisible(true);

        String[] taste = {"Брусника", "Мандарин", "Авокадо"};
        firstOptBox.getItems().addAll(taste);
        firstOptBox.setValue("Брусника");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("Объем");
        secondOptLabel.setVisible(true);

        String[] volume = {"0.3 л", "0.5 л", "1 л", "1.5 л", "2 л"};
        secondOptBox.getItems().addAll(volume);
        secondOptBox.setValue("1 л");
        secondOptBox.setVisible(true);


        thirdOptLabel.setVisible(false);
        thirdOptBox.setVisible(false);

        fourOptLabel.setVisible(false);
        fourOptBox.setVisible(false);
    }

    public void setFries() {
        clearBox();

        firstOptLabel.setText("Размер");
        firstOptLabel.setVisible(true);


        String[] size = {"Малый", "Стандартный", "Большой"};
        firstOptBox.getItems().addAll(size);
        firstOptBox.setValue("Стандартный");
        firstOptBox.setVisible(true);


        secondOptLabel.setText("Соус");
        secondOptLabel.setVisible(true);

        String[] sauce = {"100 Остров", "Горчичный", "Баребекю", "Кисло-острый"};
        secondOptBox.getItems().addAll(sauce);
        secondOptBox.setValue("Барбекю");
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
            case "Пицца" -> product = new PizzaBuilder().
                    withSort(firstOptBox.getValue()).
                    withSize(secondOptBox.getValue()).
                    withDough(thirdOptBox.getValue()).build();
            case "Лимонад" -> product = new LemonadeBuilder().
                    withTaste(firstOptBox.getValue()).
                    withVolume(secondOptBox.getValue()).build();
            case "Квас" -> product = new KvassBuilder().
                    withVolume(firstOptBox.getValue()).build();
            case "Пиво" -> product = new BeerBuilder().
                    withBrand(firstOptBox.getValue()).
                    withSort(secondOptBox.getValue()).
                    withTara(thirdOptBox.getValue()).
                    withVolume(fourOptBox.getValue()).build();
            case "Картофель фри" -> product = new FriesBuilder().
                    withSize(firstOptBox.getValue()).
                    withSauce(secondOptBox.getValue()).build();
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

        Orders.getInstance().getOrders().add(new Order(products));

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
