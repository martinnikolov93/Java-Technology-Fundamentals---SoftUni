/*
You will receive a key (integer) and n characters afterward. Add the key to each of the characters and append them
 to message. At the end print the message, which you decrypted.
        Input
        •	On the first line, you will receive the key
        •	On the second line, you will receive n – the number of lines, which will follow
        •	On the next n lines – you will receive lower and uppercase characters from the Latin alphabet
*/


import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sB = new StringBuilder();


        for (int i = 1; i <= n; i++) {
            char input = scanner.nextLine().charAt(0);
            int output = input + key;

            sB.append((char)output);
            //System.out.printf("%c",input+key);
        }

        System.out.println(sB);
    }
}
