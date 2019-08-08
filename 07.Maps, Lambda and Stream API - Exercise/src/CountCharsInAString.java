import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = String.join("",scanner.nextLine().split(" "));

        Map<Character, Integer> countNumbers = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!countNumbers.containsKey(currentChar)) {
                countNumbers.put(currentChar, 1);
            } else {
                countNumbers.put(currentChar, countNumbers.get(currentChar) + 1);
            }
        }

        countNumbers.entrySet()
                .forEach((n -> {
                    System.out.printf("%s -> %d%n", n.getKey(), n.getValue());
                }));
    }
}
