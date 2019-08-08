import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char lastChar = scanner.nextLine().charAt(0);

        printCharsInRange(firstChar,lastChar);
    }

    public static void printCharsInRange (char firstChar, char lastChar) {
        if (firstChar > lastChar) {
            for (int i = lastChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = firstChar + 1; i < lastChar; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
