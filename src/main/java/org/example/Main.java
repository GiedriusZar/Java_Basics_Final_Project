package org.example;

import com.sun.xml.internal.bind.v2.TODO;
import org.example.usersServices.Exceptions.CardNoLengthException;
import org.example.usersServices.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CardNoLengthException {

        Item item = new Item();

        Scanner scanner = new Scanner(System.in);

        String menuInput = "";


        firstRegistration(scanner);


        while (!menuInput.equals("5")) {
            userMenu();
            menuInput = scanner.nextLine();

            switch (menuInput) {


                case "1":
                    //Todo -> All items list, and adding

                    break;
                case "2":
          //          System.out.println("Login");
                    //Todo -> Checkig cart
                    break;
                case "3":
               //     System.out.println("Exit");
                    //Todo -> Removing items from cart
                    break;
                default:
              //      System.out.println("Nothing Selected");
                    //Todo -> Changing order date
                    break;
            }
        }
    }

    private static void firstRegistration(Scanner scanner) {
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
//        boolean cardNoLenght = cardNo.length() == 16;
//        if (cardNoLenght == false) {
//            throw new CardNoLengthException("Invalid card number") {
//            };
//        }
    }

    private static void mainMenu() {
        String format = String.format("%15s", "MENU");
        System.out.println();
        System.out.println(format);
        System.out.println();
        System.out.println("1 - Registration");
        System.out.println("2 - Login");
        System.out.println("3 - Exit");
    }

    private static void userMenu() {
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



