import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String number = getRandomUniqueNumber();
        String input;
        int counter = 0;
        
        while (true) {
            int bulls = 0, cows = 0;

            System.out.println("Number:");
            input = scanner.nextLine();

            if(input.equals("") || Integer.parseInt(input) / 1000 <= 0 || Integer.parseInt(input) / 1000 >= 10 || input.length() < 4 || input.length() > 4){
                System.out.println("Please enter 4 digit number without repeats or 0.");
                continue;
            }

            counter++;

            if (input.equals(number)) {
                System.out.println("You guessed it! The number was: " + number + ". It took you " + counter + " tries.");
                break;
            }

            for (int i = 0; i < number.length(); i++) {
                int symbolNumber = Character.getNumericValue(number.charAt(i));
                int symbolInput = Character.getNumericValue(input.charAt(i));

                if (symbolNumber == symbolInput) {
                    bulls++;
                } else {
                    for (int j = 0; j < number.length(); j++) {
                        if (symbolNumber == Character.getNumericValue(input.charAt(j))) {
                            cows++;
                        }
                    }
                }
            }

            System.out.printf("Bulls: %d, ",bulls);
            System.out.printf("Cows: %d%n",cows);

        }
        
    }

    private static String getRandomUniqueNumber() {
        Random random = new Random();
        String number = "";
        int digit1;
        int digit2;
        int digit3;
        int digit4;

        digit1 = random.nextInt(10);
        digit2 = random.nextInt(10);
        digit3 = random.nextInt(10);
        digit4 = random.nextInt(10);

        while (digit1 == digit2 || digit1 == digit3 || digit1 == digit4 || digit1 == 0) {
            digit1 = random.nextInt(10);
        }
        while (digit2 == digit1 || digit2 == digit3 || digit2 == digit4 || digit2 == 0) {
            digit2 = random.nextInt(10);
        }
        while (digit3 == digit1 || digit3 == digit2 || digit3 == digit4 || digit3 == 0) {
            digit3 = random.nextInt(10);
        }
        while (digit4 == digit1 || digit4 == digit2 || digit4 == digit3 || digit4 == 0) {
            digit4 = random.nextInt(10);
        }

        number = "" + digit1 + digit2 + digit3 + digit4;

        return number;
    }


}
