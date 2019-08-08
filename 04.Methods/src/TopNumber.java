import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        boolean sumDivisableBy8 = false;
        boolean hasOddNumber = false;

        for (int i = 0; i < number; i++) {

            String currentNumber = Integer.toString(i);
            for (int j = 0; j < currentNumber.length(); j++) {
                int digit = Character.getNumericValue(currentNumber.charAt(j));
                sum += digit;

                if (digit % 2 != 0) {
                    hasOddNumber = true;
                }
            }

            if (sum % 8 == 0) {
                sumDivisableBy8 = true;
            } else {
                sumDivisableBy8 = false;
            }

            if (hasOddNumber && sumDivisableBy8) {
                System.out.println(currentNumber);
            }

            hasOddNumber = false;
            sum = 0;
        }
    }
}
