/*Write a program to read an array of integers and condense them by summing adjacent couples of elements until a single
        integer is obtained. For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two
        elements and obtain {2+10, 10+3} = {12, 13}, then we sum again all adjacent elements and obtain {12+13} = {25}.*/

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(arrayNumbers.length != 1){
            int[] condensedArray = new int[arrayNumbers.length - 1];

            for (int i = 0; i < arrayNumbers.length - 1; i++) {
                condensedArray[i] = arrayNumbers[i] + arrayNumbers[i + 1];
            }

            arrayNumbers = condensedArray;
        }

        System.out.println(arrayNumbers[0]);

    }
}
