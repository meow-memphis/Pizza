package com.example.pizza.orders.product.beer;

import com.example.pizza.orders.product.Product;

public class Beer extends Product {

    private static final String[] brands = {"Афанасий", "Хайникен", "Василеостровская пивоварня", "Salden's"};
    private static final String[] sorts = {"Лагер", "Портер", " Стаут", "IPA", "Барлейвайн", "Вайсбир"};
    private static final String[] taras = {"Стекло", "Алюминий"};
    private static final String[] volumes = {"0.33 л", "0.66 л", "1.66 л"};

    private String brand;

    public static String[] getBrands() {
        return brands;
    }

    public static String[] getSorts() {
        return sorts;
    }

    public static String[] getTaras() {
        return taras;
    }

    public static String[] getVolumes() {
        return volumes;
    }

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
