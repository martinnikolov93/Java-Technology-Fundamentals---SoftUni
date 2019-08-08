/*Read an array from the console and sum only the even numbers.*/

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                sum += arrayNumbers[i];
            }
        }

        System.out.println(sum);
    }
}
