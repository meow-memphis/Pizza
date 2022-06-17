package com.example.pizza.orders.product.pizza;

import com.example.pizza.orders.product.Product;

public class Pizza extends Product {

    private static final String[] sorts = {"Пеперони", "Маргарита", "Гавайская", "3 сыра"};
    private static final String[] diameters = {"20 см", "26 см", "30 см"};
    private static final String[] doughs = {"Тонкое", "Классическое"};
    private String sort;
    private String size;

    public static String[] getSorts() {
        return sorts;
    }

    public static String[] getDiameters() {
        return diameters;
    }

    public static String[] getDoughs() {
        return doughs;
    }

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
