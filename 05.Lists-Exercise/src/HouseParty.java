/*Write a program that keeps track of the guests that are going to a house party. On the first input line you are going to
        receive how many commands you are going to have. On the next lines you are going to receive some of the
        following inputs:
        -	“{name} is going!”
        -	“{name} is not going!”
        If you receive the first type of input, you have to add the person if he/she is not in the list. (If he/she is
        in the list print on the console: “{name} is already in the list!”). If you receive the second type of input,
        you have to remove the person if he/she is in the list. (if not print: “{name} is not in the list!”). At the
        end print all the guests.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if ("not".equals(input[2])) {
                if (guests.contains(input[0])) {
                    guests.remove(input[0]);
                } else {
                    System.out.println(input[0] + " is not in the list!");
                }
            } else {
                if (guests.contains(input[0])) {
                    System.out.println(input[0] + " is already in the list!");
                } else {
                    guests.add(input[0]);
                }

            }
        }

        for (String guest :
                guests) {
            System.out.println(guest);
        }
    }
}
