import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        if (fieldSize == 0){
            return;
        }

        int[] fieldArray = new int[fieldSize];

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArray.length; i++) {
            int pos = inputArray[i];
            if (pos < fieldArray.length && pos >= 0) {
                fieldArray[pos] = 1;
            }
        }

        //System.out.println("Initial field:" + Arrays.toString(fieldArray)); //for testing

        String input = "";
        while (!"end".equals(input = scanner.nextLine())) {
            String[] commandArray = input.split(" ");

            int index = Integer.parseInt(commandArray[0]);
            String direction = commandArray[1];
            int steps = Integer.parseInt(commandArray[2]);

            if (index >= fieldArray.length || fieldArray[index] == 0) {
                continue;
            }

            if (direction.equals("right")) {
                if (index + steps >= fieldArray.length) {
                    fieldArray[index] = 0;
                } else {
                    if (fieldArray[index + steps] == 0) {
                        fieldArray[index] = 0;
                        fieldArray[index + steps] = 1;
                    } else {
                        for (int i = index + steps; i < fieldArray.length; i++) {
                            if (fieldArray[i] == 0) {
                                fieldArray[index] = 0;
                                fieldArray[i] = 1;
                            } else {
                                fieldArray[index] = 0;
                            }
                        }
                    }
                }
            } else if (direction.equals("left")) {
                if (index - steps < 0) {
                    fieldArray[index] = 0;
                } else {
                    if (fieldArray[index - steps] == 0) {
                        fieldArray[index] = 0;
                        fieldArray[index - steps] = 1;
                    } else {
                        for (int i = index - steps; i >= 0; i--) {
                            if (fieldArray[i] == 0) {
                                fieldArray[index] = 0;
                                fieldArray[i] = 1;
                            } else {
                                fieldArray[index] = 0;
                            }
                        }
                    }
                }
            }


           //System.out.println("New field:" + Arrays.toString(fieldArray)); //for testing
        }

        for (int i = 0; i < fieldArray.length; i++) {
            System.out.print(fieldArray[i] + " ");
        }
    }
}
