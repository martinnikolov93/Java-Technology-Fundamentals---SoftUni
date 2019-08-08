/*Write a program which creates 2 arrays. You will be given an integer n. On the next n lines you get 2 integers.
        Form 2 arrays as shown below.*/

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = array[0];
                secondArray[i] = array[1];
            } else {
                firstArray[i] = array[1];
                secondArray[i] = array[0];
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}
