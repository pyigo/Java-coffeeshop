import java.util.Scanner;

public class Coffee {

    private Scanner myScanner = new Scanner(System.in);
    private int[] qtySold = new int[3];

    final static double smallPrice = 1.75;
    final static double mediumPrice = 1.99;
    final static double largePrice = 2.15;
//Defining coffee cup sizes S for Small, M for Medium, L for large
    enum cupSize {S, M, L}

    public void BuyCoffee() {
        int response = 1;
        do {
            char size;

            do {
                System.out.println("Please pick coffee size");
                System.out.print("Enter " + cupSize.S + " for small, " + cupSize.M + " for medium " + cupSize.L + " for large: ");

                size = myScanner.next().charAt(0);

            } while (size != 'S' && size != 'M' && size != 'L');

            int qty;
            do {
                System.out.print("How many cup(s) do you want?: ");
                qty = myScanner.nextInt();
            } while (qty < 1);

            double cost = 0;
            if (size == 'S') {
                cost = smallPrice * qty;
                qtySold[0] = qtySold[0] + qty;
                System.out.println("Your Total is: $" + cost);
            } else if (size == 'M') {
                cost = mediumPrice * qty;
                qtySold[1] = qtySold[1] + qty;
                System.out.println("Your Total is: $" + cost);
            } else {
                cost = largePrice * qty;
                qtySold[2] = qtySold[2] + qty;
                System.out.println("Your Total is: $" + cost);
            }

            System.out.println("Would you like a another coffee? 1 for YES, 2 for NO");
            response = myScanner.nextInt();
        } while (response != 2);
    }

    public void ShowNumberofCupsbySize() {
//        for (int i = 0; i < qtySold.length; i++) {
//            System.out.println(qtySold[i] + ",  ");
//        }
        System.out.println("Number of cups sold by size");
        System.out.println("Small Cups: " + qtySold[0]);
        System.out.println("Medium Cups: " + qtySold[1]);
        System.out.println("Large Cups: " + qtySold[2]+"\n");
    }

    public void ShowTotalAmountCoffeeSold() {
        int totalCoffeeSold = 0;
        for (int i = 0; i < qtySold.length; i++) {
            totalCoffeeSold = totalCoffeeSold + qtySold[i];
        }
        System.out.println("Total amount of coffee cups sold: " + totalCoffeeSold+"\n");
    }

    public void ShowTotalMoneyMade() {
        double totalMoneySmall = qtySold[0] * smallPrice;
        double totalMoneyMedium = qtySold[0] * mediumPrice;
        double totalMoneyLarge = qtySold[0] * largePrice;
        double totalMoneyMade = totalMoneySmall + totalMoneyMedium + totalMoneyLarge;
        System.out.println("Total amount of money made: $" + totalMoneyMade+"\n");
    }
}



