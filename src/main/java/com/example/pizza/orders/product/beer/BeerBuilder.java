package com.example.pizza.orders.product.beer;

public class BeerBuilder {

    private Beer beer = new Beer();

    public BeerBuilder withBrand(String brand) {
        beer.setBrand(brand);
        return this;
    }

    public BeerBuilder withTara(String tara) {
        beer.setTara(tara);
        return this;
    }

    public BeerBuilder withSort(String sort) {
        beer.setSort(sort);
        return this;
    }

    public BeerBuilder withVolume(String volume) {
        beer.setVolume(volume);
        return this;
    }

    public Beer build() {
        return beer;
    }

}
