/*You will be given a count of wagons in a train n. On the next n lines you will receive how many people are going to get
        on that wagon. At the end print the whole train and after that the sum of the people in the train.*/
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
           array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(Arrays.stream(array).sum());
    }
}
