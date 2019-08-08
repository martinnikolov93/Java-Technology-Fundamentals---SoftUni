import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        System.out.println(multiplyTwoStrings(input[0], input[1]));
    }

    public static int multiplyTwoStrings (String firstString,String secondString) {
        int sum = 0;
        int minLenght = 0;

        if (firstString.length() < secondString.length()) {
            minLenght = firstString.length();
            for (int i = minLenght; i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        } else if (secondString.length() < firstString.length()) {
            minLenght = secondString.length();
            for (int i = minLenght; i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
        } else {
            minLenght = firstString.length();
        }

        for (int i = 0; i < minLenght; i++) {
           sum += firstString.charAt(i) * secondString.charAt(i);
        }

        return sum;
    }
}
