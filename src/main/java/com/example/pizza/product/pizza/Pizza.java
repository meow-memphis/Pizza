package com.example.pizza.product.pizza;

import com.example.pizza.product.Product;

public class Pizza implements Product {
    private String string;
    private String size;
    private String dough;

    public String getSort() {
        return string;
    }

    public void setSort(String string) {
        this.string = string;
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

}
