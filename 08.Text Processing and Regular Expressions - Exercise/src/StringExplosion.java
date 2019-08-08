import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int strenght = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '>') {
                strenght += Character.getNumericValue(input.charAt(i + 1));

                int bombingLenght = strenght;

                for (int j = i + 1; j <= i + bombingLenght; j++) {
                    if (j >= input.length()) {
                        break;
                    }
                    if (input.charAt(j) == '>') {
                        break;
                    }
                    if (strenght == 0){
                        break;
                    }

                    input.deleteCharAt(j);
                    j--;
                    strenght--;
                }
            }
        }
        System.out.println(input);
    }
}
