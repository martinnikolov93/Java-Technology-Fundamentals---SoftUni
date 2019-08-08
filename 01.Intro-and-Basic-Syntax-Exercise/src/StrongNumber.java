/*Write a program to check if a given number is a strong number or not. A number is strong if the sum of the Factorial of each digit is equal to the number.
        For example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes" if the number is strong and "no" if the number is not strong.*/

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int factorial = 1;
        int factorialSum = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            for (int j = 1; j <= digit; j++) {
                factorial = factorial * j;
            }
            factorialSum += factorial;
            factorial = 1;
        }

        if (factorialSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
