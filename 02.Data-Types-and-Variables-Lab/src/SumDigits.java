/*You will be given a single integer. Your task is to find the sum of its digits.*/

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int num = Character.getNumericValue(input.charAt(i));
            sum += num;
        }

        System.out.println(sum);
    }
}
