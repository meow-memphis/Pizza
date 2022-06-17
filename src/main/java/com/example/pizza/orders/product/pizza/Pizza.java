package com.example.pizza.orders.product.pizza;

import com.example.pizza.orders.product.Product;

public class Pizza extends Product {
    private String sort;
    private String size;
    private String dough;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public String getFullName() {
        return "Пицца " + sort + " " + size + " " + dough + " тесто";
    }
}
