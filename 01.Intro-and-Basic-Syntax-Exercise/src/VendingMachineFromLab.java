import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VendingMachineFromLab {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String coinsInput = "";

        double sum = 0.0;

        while (!"Start".equals(coinsInput = reader.readLine())) {

            if (coinsInput.equals("0.1") || coinsInput.equals("0.2") || coinsInput.equals("0.5") ||
                    coinsInput.equals("1") || coinsInput.equals("2")) {
                sum += Double.parseDouble(coinsInput);
            } else {
                System.out.printf(String.format("Cannot accept %.2f", Double.parseDouble(coinsInput)));
            }
            System.out.println(" ");
        }
        String productInput = reader.readLine();

        while (!"End".equals(productInput)) {

            switch (productInput) {
                case "Nuts":

                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.println("Purchased " + productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Water":

                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased " + productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;

                case "Crisps":

                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased " + productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;

                case "Soda":

                    if (sum >= 0.😎 {
                    sum -= 0.8;
                    System.out.println("Purchased " + productInput);
                } else {
                    System.out.println("Sorry, not enough money");
                }

                break;

                case "Coke":

                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.println("Purchased " + productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;

                default:
                    System.out.println("Invalid product");
                    break;


            }

            productInput = reader.readLine();
        }

        System.out.println(String.format("Change: %.2f", sum));

    }

}