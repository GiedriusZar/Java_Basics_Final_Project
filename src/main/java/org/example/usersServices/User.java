package org.example.usersServices;

import org.example.Cart;
import org.example.Item;
import org.example.ItemsBase;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class User {

    private String name;
    private String surname;
    private String cardNo;
    private String address;
    private static int userID;
    private int maxOrderAmount;
    private Cart cart;
    private LocalDate deliveryDate;

    Random randomID = new Random();

    public User(String name, String surname, String cardNo, String address) {
        this.name = name;
        this.surname = surname;
        this.cardNo = cardNo;
        this.address = address;
        this.userID = randomIdGenerator();
        this.maxOrderAmount = getMaxAmount();
        this.cart = new Cart();
        this.deliveryDate = deliveryDate;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxOrderAmount = maxAmount;
    }

    public int getMaxAmount() {
        return maxOrderAmount;
    }

    public int getUserID() {
        return userID;
    }

    private int randomIdGenerator(){
        int ID = randomID.nextInt(10000);
        return ID;
    }

    public void addItemToCart(Item item){


        cart.getItemsCart().add(new Item());
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

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
