package org.example;

import java.util.ArrayList;
import java.util.List;

public class ItemsBase{

    private List<Item> allItems = new ArrayList<>();

    public ItemsBase() {
        super();


    }

    public List<Item> getAllItems() {
        return allItems;
    }

    @Override
    public String toString() {
        return "ItemsBase{" +
                "allItems=" + allItems +
                '}';
    }
}
