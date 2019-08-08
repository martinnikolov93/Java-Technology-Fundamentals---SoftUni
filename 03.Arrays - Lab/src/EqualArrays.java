/*Read two arrays and print on the console whether they are identical or not. Arrays are identical if their elements are
        equal. If the arrays are identical find the sum of the first one and print on the console following message:
        "Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ and print on the
        console following message: "Arrays are not identical. Found difference at {index} index."*/

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sum = 0;
        boolean arraysAreEqual = true;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                arraysAreEqual = false;
                break;
            }

            sum += firstArray[i];

        }

        if (arraysAreEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
