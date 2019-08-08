/*Write a program, which reads a list of integers from the console and receives commands, which manipulate the list.
        Your program may receive the following commands:
        •	Delete {element} – delete all elements in the array, which are equal to the given element
        •	Insert {element} {position} – insert element and the given position
        You should stop the program when you receive the command "end". Print all numbers in the array separated with
        single whitespace.*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!"end".equals(input)){

            String[] data = input.split(" ");

            String command = data[0];

            switch (command){
                case "Delete":

                    elements = elements
                            .stream()
                            .filter(e -> !e.equals(data[1]))
                            .collect(Collectors.toList());
                    break;

                case "Insert":
                    String element = data[1];

                    int position = Integer.parseInt(data[2]);

                    if (position >= 0 && position < elements.size()) {
                        elements.add(position, element);
                    }
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println(elements.toString().replaceAll("[\\[\\],]",""));
    }
}
