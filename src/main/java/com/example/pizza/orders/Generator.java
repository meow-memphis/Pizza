package com.example.pizza.orders;

import com.example.pizza.orders.product.Product;
import com.example.pizza.orders.product.beer.Beer;
import com.example.pizza.orders.product.beer.BeerBuilder;
import com.example.pizza.orders.product.burger.Burger;
import com.example.pizza.orders.product.burger.BurgerBuilder;
import com.example.pizza.orders.product.drink.Kvass;
import com.example.pizza.orders.product.drink.KvassBuilder;
import com.example.pizza.orders.product.drink.Lemonade;
import com.example.pizza.orders.product.drink.LemonadeBuilder;
import com.example.pizza.orders.product.fries.Fries;
import com.example.pizza.orders.product.fries.FriesBuilder;
import com.example.pizza.orders.product.pizza.Pizza;
import com.example.pizza.orders.product.pizza.PizzaBuilder;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public void generate() {

        for (int i = 0; i < ThreadLocalRandom.current().nextInt(6, 20); i++) {

            Order order = new Order(new ArrayList<>());

            for (int j = 0; j < ThreadLocalRandom.current().nextInt(1, 15); j++) {

                order.getProducts().add(productGen());

            }

            Orders.getInstance().getOrders().add(order);
        }


    }

    public Product productGen() {
        Product product = null;

        int rand = ThreadLocalRandom.current().nextInt(1, 7);

        switch (rand) {
            case 1 -> product = new PizzaBuilder().
                    withSort(getRand(Pizza.getSorts())).
                    withSize(getRand(Pizza.getDiameters())).
                    withDough(getRand(Pizza.getDoughs())).build();

            case 2 -> product = new LemonadeBuilder().
                    withTaste(getRand(Lemonade.getTastes())).
                    withVolume(getRand(Lemonade.getVolumes())).build();

            case 3 -> product = new KvassBuilder().
                    withVolume(getRand(Kvass.getVolumes())).build();

            case 4 -> product = new BeerBuilder().
                    withBrand(getRand(Beer.getBrands())).
                    withSort(getRand(Beer.getSorts())).
                    withTara(getRand(Beer.getTaras())).
                    withVolume(getRand(Beer.getVolumes())).build();

            case 5 -> product = new FriesBuilder().
                    withSize(getRand(Fries.getSizes())).
                    withSauce(getRand(Fries.getSauces())).build();

            case 6 -> product = new BurgerBuilder().
                    withSort(getRand(Burger.getSorts())).
                    withType(getRand(Burger.getTypes())).
                    withSauce(getRand(Burger.getSauces())).build();
        }

        return product;
    }

    public String getRand(String[] mas) {
        return mas[ThreadLocalRandom.current().nextInt(0, mas.length)];
    }

}
