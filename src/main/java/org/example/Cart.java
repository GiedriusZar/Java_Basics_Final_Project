package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart<I> {


    List<Item> itemsCart;

    public Cart() {
        itemsCart = new ArrayList<>();

    }

    public List<Item> getItemsCart() {
        return itemsCart;
    }
}
