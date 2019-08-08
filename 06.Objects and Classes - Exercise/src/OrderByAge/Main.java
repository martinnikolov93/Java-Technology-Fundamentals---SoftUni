package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<PersonTwo> persons = new ArrayList<>();

        String input = "";

        while(!"End".equals(input = scanner.nextLine())){
            String[] data = input.split("\\s+");

            String name = data[0];
            int id = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);

            PersonTwo person = new PersonTwo(name,id,age);

            persons.add(person);
        }

        persons
                .stream()
                .sorted((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()))
                .forEach(e -> System.out.println(
                        String.format("%s with ID: %d is %d years old.",e.getName(),e.getId(),e.getAge())
                ));
    }
}
