package org.example.usersServices;

import org.example.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> itemsList;

    public Cart() {
        this.itemsList = new ArrayList<>();
    }


    public List<Item> getItemsList() {
        return itemsList;
    }


    public void addToCart(Item item){
        itemsList.add(item);
    }
}
