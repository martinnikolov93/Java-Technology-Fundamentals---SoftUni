import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {

            String[] inputArray = input.split("\\s+");

            String command = inputArray[0];
            String value = inputArray[1];
            switch (command) {
                case "Add":
                    numbers.add(value);
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputArray[2]);
                    if (index < 0 || index >= numbers.size()){
                        System.out.println("Invalid index");
                        continue;
                    }
                    numbers.add(index,value);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(inputArray[1]);
                    if (indexToRemove < 0 || indexToRemove >= numbers.size()){
                        System.out.println("Invalid index");
                        continue;
                    }
                    numbers.remove(indexToRemove);
                    break;
                case "Shift":
                    String direction = inputArray[1];
                    int count = Integer.parseInt(inputArray[2]);

                    if (direction.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else if (direction.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(0,numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }

            //System.out.println(numbers); // for testing purposes
        }

        System.out.println(numbers.toString().replaceAll("[,\\[\\]]",""));

    }
}
