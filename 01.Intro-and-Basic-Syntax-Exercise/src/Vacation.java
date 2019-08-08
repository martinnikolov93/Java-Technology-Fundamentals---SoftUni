/*You are given a group of people, type of the group, on which day of the week they are going to stay. Based on that information
calculate how much they have to pay and print that price on the console. Use the table below. In each cell is the price for a single person.
The output should look like that: "Total price: {price}". The price should be rounded to the second decimal point.
                Friday	Saturday	Sunday
        Students	8.45	9.80	10.46
        Business	10.90	15.60	16
        Regular	    15	    20	    22.50*/


import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();

        double price = 0.00;

        if (groupType.equals("Students")) {
            if (dayType.equals("Friday")) {
                price = 8.45;
            } else if (dayType.equals("Saturday")) {
                price = 9.80;
            } else if (dayType.equals("Sunday")) {
                price = 10.46;
            }
        } else if (groupType.equals("Business")) {
            if (dayType.equals("Friday")) {
                price = 10.90;
            } else if (dayType.equals("Saturday")) {
                price = 15.60;
            } else if (dayType.equals("Sunday")) {
                price = 16;
            }
        } else if (groupType.equals("Regular")) {
            if (dayType.equals("Friday")) {
                price = 15;
            } else if (dayType.equals("Saturday")) {
                price = 20;
            } else if (dayType.equals("Sunday")) {
                price = 22.50;
            }
        }

        double totalPrice = price*count;

        if (groupType.equals("Students") && count >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (groupType.equals("Business") && count >= 100) {
            totalPrice = totalPrice - (10 * price);
        } else if (groupType.equals("Regular") && count >= 10 && count <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.println(String.format("Total price: %.2f",totalPrice));
    }
}
