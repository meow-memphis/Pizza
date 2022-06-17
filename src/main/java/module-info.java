module com.example.pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizza to javafx.fxml;
    exports com.example.pizza;
    exports com.example.pizza.orders;
    opens com.example.pizza.orders to javafx.fxml;
    exports com.example.pizza.controllers;
    opens com.example.pizza.controllers to javafx.fxml;
}