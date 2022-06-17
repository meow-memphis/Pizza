package com.example.pizza.product.drink;

public class LemonadeBuilder {
    private Lemonade lemonade = new Lemonade();

    public LemonadeBuilder withTaste(String taste) {
        lemonade.setTaste(taste);
        return this;
    }

    public LemonadeBuilder withVolume(String volume) {
        lemonade.setVolume(volume);
        return this;
    }

    public Lemonade build() {
        return lemonade;
    }

}
