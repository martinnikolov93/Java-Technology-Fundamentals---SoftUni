/*Enter a day number [1…7] and print the day name (in English) or "Invalid day!". Use an array of strings.*/

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 7) {
            System.out.println(array[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }



    }
}
