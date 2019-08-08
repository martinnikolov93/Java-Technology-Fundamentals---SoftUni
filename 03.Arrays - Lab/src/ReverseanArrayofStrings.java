/*Write a program to read an array of strings, reverse it and print its elements. The input consists of a sequence of
        space separated strings. Print the output on a single line (space separated).*/

import java.util.Scanner;

public class ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
