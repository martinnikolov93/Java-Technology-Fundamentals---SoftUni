/*On the first line you will be given a list of wagons (integers). Each integer represents the number of passengers that
        are currently in each wagon. On the next line you will get the max capacity of each wagon (single integer).
        Until you receive "end" you will be given two types of input:
        •	Add {passengers} – add a wagon to the end with the given number of passengers.
        •	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
        At the end print the final state of the train (all the wagons separated by a space)*/


        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while(!"end".equals(input)){
            String[] data = input.split(" ");

            if (data.length == 2) {
                int number = Integer.parseInt(data[1]);
                numbers.add(number);
            } else {
                int number = Integer.parseInt(data[0]);

                for (int i = 0; i < numbers.size(); i++) {
                    int currentElement = numbers.get(i);

                    if (currentElement + number <= maxCapacity) {
                        numbers.set(i, currentElement + number);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
