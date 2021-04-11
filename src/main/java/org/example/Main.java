package org.example;

import com.sun.xml.internal.bind.v2.TODO;
import org.example.usersServices.Exceptions.CardNoLengthException;
import org.example.usersServices.Exceptions.DayOfWeekException;
import org.example.usersServices.User;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;


public class Main {

    public static void main(String[] args) throws CardNoLengthException, DayOfWeekException {

        Item item = new Item();
        ItemsBase allItemBase = new ItemsBase();

        Scanner scanner = new Scanner(System.in);

        String menuInput = "";

        System.out.println("REGISTRATION");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Card number: ");
        String cardNo = scanner.nextLine();
        if (cardNo.length() != 16) {
            throw new CardNoLengthException("Invalid card number") {
            };
        }
        System.out.print("Address: ");
        String address = scanner.nextLine();
        User user = new User(name, surname, cardNo, address);


        while (!menuInput.equals("5")) {
            userMenu();
            menuInput = scanner.nextLine();

            switch (menuInput) {

                case "1":
                    System.out.println(allItemBase.getAllItems());
                    break;
                case "2":
                    user.addItemToCart(new Item(ItemType.FISHING, "Rod", "587", 9, 5));
                    //Todo -> Adding items
                    break;
                case "3":
                    System.out.println(user.showCart());
                    break;
                case "4":

                    //Todo -> Removing items from cart
                    break;
                case "5":
                    System.out.println("\n \t\t\t\t\t\t\t IMPORTANT!! \n You can't change order date if Your delivery will arive in less than 5 days\n\n How many days from now would You like Your dellivery to arrive?");
                    int days = scanner.nextInt();
                    user.setDeliveryDate(LocalDate.now().plusDays(days));
                    if (user.getDeliveryDate().getDayOfWeek()==DayOfWeek.SATURDAY||user.getDeliveryDate().getDayOfWeek()==DayOfWeek.SUNDAY){
                        throw new DayOfWeekException("We dont deliver items on weekends");
                    } else {
                        System.out.println("Your dellivery will arrive at: " + user.getDeliveryDate());
                    }
                    //Todo -> Set order date
                    break;
                case "6":
                    //Todo -> Change order date
                    break;
                case "7":
                    userMenu();
                    break;
                default:
                    System.out.println("Nothing selected");
            }
        }
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
        System.out.println("1 - See available items");
        System.out.println("2 - Add items to my cart");
        System.out.println("3 - Check my cart");
        System.out.println("4 - Remove items from my cart");
        System.out.println("5 - Set order date");
        System.out.println("6 - Change order date");
        System.out.println("7 - Exit");
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



