import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);


        System.out.println();

        Coffee coffee = new Coffee();

        boolean exit = false;

        do {
            int choice;

            do {

                System.out.println("****************** Menu *****************");
                System.out.println("*\t1. Buy coffee\t\t\t\t\t\t*");
                System.out.println("*\t2. Show number of coffee cups sold\t*");
                System.out.println("*\t3. Show total amount of coffee sold\t*");
                System.out.println("*\t4. Show total amount of money made\t*");
                System.out.println("*\t5. Exit\t\t\t\t\t\t\t\t*");
                System.out.println("*****************************************");
                System.out.print("PLease enter a number corresponding to menu: ");

                choice = myScan.nextInt();
            } while (choice < 1 || choice > 5);

            switch (choice) {
                case 1:
                    coffee.BuyCoffee();
                    break;
                case 2:
                    coffee.ShowNumberofCupsbySize();
                    break;
                case 3:
                    coffee.ShowTotalAmountCoffeeSold();
                    break;
                case 4:
                    coffee.ShowTotalMoneyMade();
                    break;
                default:
                    exit = true;
            }

        } while (!exit);

        System.out.println("Bye bye");
        System.out.println("See you next year");
        System.exit(0);

    }

}
