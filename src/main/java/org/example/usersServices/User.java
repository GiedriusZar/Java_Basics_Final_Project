package org.example.usersServices;

import org.example.Cart;
import org.example.Item;

import java.util.List;
import java.util.Random;

public class User {

    private String name;
    private String surname;
    private String cardNo;
    private String address;
    private static int userID;
    private int maxAmount;
    private Cart cart;

    Random randomID = new Random();

    public User(String name, String surname, String cardNo, String address) {
        this.name = name;
        this.surname = surname;
        this.cardNo = cardNo;
        this.address = address;
        this.userID = randomIdGenerator();
        this.maxAmount = maxAmount;
        this.cart = new Cart();
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getUserID() {
        return userID;
    }

    private int randomIdGenerator(){
        int ID = randomID.nextInt(10000);
        return ID;
    }

    public void addItemToCart(Item item){
        cart.getItemsCart().add(item);
    }

    public List showCart(){
        return cart.getItemsCart();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
