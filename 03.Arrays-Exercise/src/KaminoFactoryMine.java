import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactoryMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int currentSequenceCounter = 0;
        int currentBestSequenceCounter = 0;
        int bestSequenceCounter = 0;

        String currentSequence = "";
        String currentBestSequence = "";
        String bestSequence = "";

        int currentSum = 0;
        int currentBestSum = 0;
        int bestSum = 0;

        int currentIndex = 0;
        int currentBestIndex = Integer.MAX_VALUE;
        int bestIndex = 0;

        while (!input.equals("Clone them!")) {

            int[] array = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    currentSum += array[i];

                }
                if (currentSum > currentBestSum) {
                    currentBestSum = currentSum;
                }


                if(i == array.length - 1){ //break if last index is being checked
                    break;
                }

                if (array[i] == array[i + 1] && array[i] == 1) {
                    currentSequenceCounter++;
                    currentSequence = input;

                    currentIndex = i;
                    if (currentIndex < currentBestIndex) {
                        currentBestIndex = currentIndex;
                    }

                    if (currentSequenceCounter >= currentBestSequenceCounter) {
                        currentBestSequenceCounter = currentSequenceCounter;
                        currentBestSequence = currentSequence;

                    }

                } else {
                    currentSequenceCounter = 0;
                    currentSequence = "";
                }
            }

            if (currentBestSum > bestSum) {
                bestSum = currentBestSum;
            }

            if (currentBestSequenceCounter > bestSequenceCounter) {
                    bestSequenceCounter = currentBestSequenceCounter;
                    bestSequence = currentBestSequence;
            }
            
            currentSum = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSequenceCounter,bestSum);
        System.out.println(bestSequence.replace("!"," "));


    }
}
