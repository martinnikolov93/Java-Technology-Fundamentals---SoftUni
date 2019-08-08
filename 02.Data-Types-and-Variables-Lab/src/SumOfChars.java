/*Write a program, which sums the ASCII codes of n characters and prints the sum on the console.*/

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            char letter = scanner.nextLine().charAt(0);

            sum += (int) letter;
        }

        System.out.println("The sum equals: " + sum);
    }
}
