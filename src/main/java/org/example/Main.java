package org.example;

import org.example.usersServices.Cart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String menuInput = "";


        Item item = new Item(ItemType.FISHING, "Fishing rod", "21697", 99, 5);
        Item item2 = new Item(ItemType.GARDENING, "Seeds", "45896", 1, 150);

        Cart cart = new Cart();

        cart.addToCart(item);
        cart.addToCart(item2);

//        System.out.println(cart.getItemsList());

        while (!menuInput.equals("5")) {
            mainMenu();
            menuInput = scanner.nextLine();

            switch (menuInput) {


                case "1":
                    System.out.println("Register");
                    break;
                case "2":
                    System.out.println("Login");
                    break;
                case "3":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Nothing Selected");
                    break;
            }
        }
    }

    private static void mainMenu() {
        String format = String.format("%15s", "MENU");
        System.out.println();
        System.out.println(format);
        System.out.println();
        System.out.println("1 - Register");
        System.out.println("2 - Login");
        System.out.println("3 - Exit");
    }

    private static void userMenu() {
        String format = String.format("%15s", "MENU");
        System.out.println();
        System.out.println(format);
        System.out.println();
        System.out.println("1 - Add items to my cart");
        System.out.println("2 - Remove items from my cart");
        System.out.println("3 - Change order date");
    }

    private static void adminMenu() {
        String format = String.format("%15s", "MENU");
        System.out.println();
        System.out.println(format);
        System.out.println();
        System.out.println("1 - Register");
        System.out.println("2 - Login");
        System.out.println("3 - Exit");
    }


}



