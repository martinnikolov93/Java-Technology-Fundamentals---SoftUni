/*You task is to calculate the total price of a purchase from a vending machine. Until you receive "Start" you will be given different coins
        that are being inserted in the machine. You have to sum them in order to have the total money inserted. There is a problem though.
        Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins you have to display "Cannot accept {money}",
        where the value is formated to the second digit after the decimal point and not add it to the total money. On the next few lines until
        you receive "End" you will be given products to purchase. Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke".
        The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product print “Invalid product”.
        Be careful that the person may try to purchase a product for which he doesn't have money. In that case print "Sorry, not enough money".
        If the person purchases a product successfully
        print "Purchased {product name}". After the “End” command print the money that are left formatted to the second decimal point in the format "Change: {money left}".*/

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        double totalMoney = 0.00;
        double nutPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            }

            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                totalMoney += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }


        }

        while (true) {
            input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            if (input.equals("Nuts")) {
                if (totalMoney >= nutPrice) {
                    totalMoney = totalMoney - nutPrice;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (totalMoney >= waterPrice) {
                    totalMoney = totalMoney - waterPrice;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (totalMoney >= crispsPrice) {
                    totalMoney = totalMoney - crispsPrice;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (totalMoney >= sodaPrice) {
                    totalMoney = totalMoney - sodaPrice;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (totalMoney >= cokePrice) {
                    totalMoney = totalMoney - cokePrice;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
        }


        System.out.printf("Change: %.2f",totalMoney);

    }
}
