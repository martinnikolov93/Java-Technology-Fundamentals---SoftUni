import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length() - 1; i++) {
            while (input.charAt(i) == input.charAt(i + 1)){
                input.replace(i,i + 1,"");
                if (i == input.length() - 1) {
                    break;
                }
            }
        }


        System.out.println(input);
    }
}
