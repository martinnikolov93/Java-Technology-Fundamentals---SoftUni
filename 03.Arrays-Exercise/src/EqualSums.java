import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < i; j++) {
                sumLeft += array [j];
            }

            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }

            if (array.length == 1) {
                System.out.println(0);
                return;
            } else if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }

            sumLeft = 0;
            sumRight = 0;
        }

        System.out.println("no");
    }
}
