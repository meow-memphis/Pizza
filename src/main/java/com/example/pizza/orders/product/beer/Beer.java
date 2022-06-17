package com.example.pizza.orders.product.beer;

import com.example.pizza.orders.product.Product;

public class Beer extends Product {

    private String brand;
    private String tara;
    private String sort;
    private String volume;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String getFullName() {
        return "Пиво " + brand + " " + sort + " " + tara + " " + volume;
    }
}
