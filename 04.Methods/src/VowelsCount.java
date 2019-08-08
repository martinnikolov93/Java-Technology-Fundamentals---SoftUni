import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                count++;

            }
        }
        System.out.println(count);
    }

    public static boolean isVowel (char symbol) {
        switch (symbol) {
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
            case 'y':
                return true;
        }

        return false;
    }
}
