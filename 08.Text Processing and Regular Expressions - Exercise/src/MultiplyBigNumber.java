/*import java.util.Scanner;You are given two lines – the first one can be a really big number (0 to 1050). The second
one will be a single digit number (0 to 9). You must display the product of these numbers.
        Note: do not use the BigInteger class.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier == 0) {
            System.out.println(0);
        } else {
            int remainder = 0;
            List<Integer> result = new ArrayList<>();
            for (int i = number.length() - 1; i >= 0; i--) {
                int currentResult = Character.getNumericValue(number.charAt(i)) * multiplier;
                currentResult += remainder;
                remainder = currentResult / 10;
                result.add(currentResult % 10);
            }

            if (remainder != 0) {
                result.add(remainder);
            }

            for (int i = result.size() - 1; i >= 0; i--) {
                System.out.printf("%d",result.get(i));
            }
        }
    }
}
