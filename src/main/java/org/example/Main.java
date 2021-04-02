package org.example;

import org.example.usersServices.Exceptions.CardNoLengthException;
import org.example.usersServices.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CardNoLengthException {

        Scanner scanner = new Scanner(System.in);

        String menuInput = "";

//        User user = new User("Giedrius", "Zareckas", "CardNo", "Kaunas");
//
//        Item item = new Item(ItemType.FISHING, "Fishing rod", "2547", 99, 5);
//        Item item1 = new Item(ItemType.CLOTHES, "Shoes", "2677", 35, 32);
//        Item item2 = new Item(ItemType.DRINKS, "Whiskey Blue Label", "47", 189, 10);
//        user.addItemToCart(item);
//        user.addItemToCart(item1);
//        user.addItemToCart(item2);
//        System.out.println(user.showCart());


        while (!menuInput.equals("5")) {
            mainMenu();
            menuInput = scanner.nextLine();

            switch (menuInput) {


                case "1":
                    System.out.println("REGISTRATION");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Card number: ");
                    String cardNo = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    User user = new User(name, surname, cardNo, address);
                    System.out.println(user.getName());
                    System.out.println(user.getSurname());
                    System.out.println(user.getAddress());
                    System.out.println(user.getUserID());
                    boolean cardNoLenght = cardNo.length()==16;
                    if (cardNoLenght == false){
                        throw new CardNoLengthException("Invalid card number"){
                        };
                    }
                    userMenu();
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

        private static void mainMenu () {
            String format = String.format("%15s", "MENU");
            System.out.println();
            System.out.println(format);
            System.out.println();
            System.out.println("1 - Register");
            System.out.println("2 - Login");
            System.out.println("3 - Exit");
        }

        private static void userMenu () {
            String format = String.format("%15s", "MENU");
            System.out.println();
            System.out.println(format);
            System.out.println();
            System.out.println("1 - Add items to my cart");
            System.out.println("2 - Check my cart");
            System.out.println("3 - Remove items from my cart");
            System.out.println("4 - Change order date");
        }

//        private static void adminMenu () {
//            String format = String.format("%15s", "MENU");
//            System.out.println();
//            System.out.println(format);
//            System.out.println();
//            System.out.println("1 - Register");
//            System.out.println("2 - Login");
//            System.out.println("3 - Exit");
//        }


    }



