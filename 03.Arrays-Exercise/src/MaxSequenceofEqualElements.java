/*Write a program that finds the longest sequence of equal elements in an array of integers. If several longest sequences
        exist, print the leftmost one.*/
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentSequenceCounter = 0;
        int bestSequenceCounter = 0;
        String currentSequence = "";
        String bestSequence = "";

        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                break;
            }

            if (array[i] == array[i + 1]) {
                currentSequenceCounter++;
                currentSequence += "" + array[i] + " ";

                if (currentSequenceCounter == 1) {
                    currentSequence += "" + array[i] + " ";
                }

                if (currentSequenceCounter > bestSequenceCounter) {
                    bestSequenceCounter = currentSequenceCounter;
                    bestSequence = currentSequence;
                }
            } else {
                currentSequenceCounter = 0;
                currentSequence = "";
            }


        }
        System.out.println(bestSequence);
    }
}
