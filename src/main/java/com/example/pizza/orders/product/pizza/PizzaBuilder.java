package com.example.pizza.orders.product.pizza;

public class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder withSort(String string) {
        pizza.setSort(string);
        return this;
    }

    public PizzaBuilder withSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder withDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
