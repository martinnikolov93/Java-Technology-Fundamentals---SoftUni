/*Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.*/

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                evenSum += arrayNumbers[i];
            } else {
                oddSum += arrayNumbers[i];
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
