package com.example.pizza.orders.product.drink;

public class KvassBuilder {

    private Kvass kvass = new Kvass();

    public KvassBuilder withVolume(String volume) {
        kvass.setVolume(volume);
        return this;
    }

    public Kvass build() {
        return kvass;
    }
}
