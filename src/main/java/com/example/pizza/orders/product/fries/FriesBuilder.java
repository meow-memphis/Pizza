package com.example.pizza.orders.product.fries;

public class FriesBuilder {

    private Fries fries = new Fries();

    public FriesBuilder withSize(String size) {
        fries.setSize(size);
        return this;
    }

    public FriesBuilder withSauce(String sauce) {
        fries.setSauce(sauce);
        return this;
    }

    public Fries build() {
        return fries;
    }


}
