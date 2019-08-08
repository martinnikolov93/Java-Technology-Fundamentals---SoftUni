import java.util.Scanner;

public class PalindromIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")) {

            boolean palindrom = isPalindrom(input);
            System.out.println(palindrom);

            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrom(String input){
        String part1 = "";
        String part2 = "";

        for (int i = 0; i < input.length() / 2; i++) {
            part1 += input.charAt(i);
        }
        //System.out.println(part1);


        if (input.length() % 2 == 0) {
            for (int i = input.length() / 2; i < input.length(); i++) {
                part2 += input.charAt(i);
            }
        } else {
            for (int i = input.length() / 2; i < input.length() - 1; i++) {
                part2 += input.charAt(i + 1);
            }
        }
        //System.out.println(part2);

        for (int i = 0; i < part1.length(); i++) {
            if (part1.charAt(i) != part2.charAt(part2.length() - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
