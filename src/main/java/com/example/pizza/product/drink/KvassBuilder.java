package com.example.pizza.product.drink;

public class KvassBuilder {

    Kvass kvass = new Kvass();

    public KvassBuilder withVolume(String volume) {
        kvass.setVolume(volume);
        return this;
    }

    public Kvass build() {
        return kvass;
    }
}
