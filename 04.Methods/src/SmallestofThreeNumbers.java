/*Write a method to print the smallest of three integer numbers. Use appropriate name for the method.*/
import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        printSmallestInt(numbers);

    }

    public static void printSmallestInt (int[] numbers) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println(minValue);
    }
}
