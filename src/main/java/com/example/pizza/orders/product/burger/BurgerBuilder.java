package com.example.pizza.orders.product.burger;

import com.example.pizza.orders.product.pizza.Pizza;
import com.example.pizza.orders.product.pizza.PizzaBuilder;

public class BurgerBuilder {

    private Burger burger = new Burger();

    public BurgerBuilder withSort(String sort) {
        burger.setSort(sort);
        return this;
    }

    public BurgerBuilder withType(String type) {
        burger.setType(type);
        return this;
    }

    public BurgerBuilder withSauce(String sauce) {
        burger.setSauce(sauce);
        return this;
    }

    public Burger build() {
        return burger;
    }

}
