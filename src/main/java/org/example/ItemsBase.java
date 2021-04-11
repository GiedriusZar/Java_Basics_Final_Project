package org.example;

import java.util.ArrayList;
import java.util.List;

public class ItemsBase{

    private  List<Item> allItems = new ArrayList<>();

    Item item1 = new Item(ItemType.FISHING, "Fishing rod", "2547", 99, 5);
    Item item2 = new Item(ItemType.CLOTHES, "Shoes", "2677", 35, 32);
    Item item3 = new Item(ItemType.DRINKS, "Whiskey Blue Label", "47", 189, 10);

    public ItemsBase() {
        addAllItems();
    }


    public  List<Item> getAllItems() {
        return allItems;
    }

    public List<Item> addAllItems() {
        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);

        return allItems;
    }



    @Override
    public String toString() {
        return "ItemsBase{" +
                "allItems=" + allItems +
                '}';
    }
}
