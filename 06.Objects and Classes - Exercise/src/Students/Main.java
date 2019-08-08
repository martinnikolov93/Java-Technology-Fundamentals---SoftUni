package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student student = new Student(firstName,lastName,grade);

            students.add(student);
        }

        students
                .stream()
                .sorted((d1,d2) -> Double.compare(d2.getGrade(),d1.getGrade()))
                .forEach(e -> System.out.println(
                        String.format("%s %s: %.2f",e.getFirstName(),e.getLastName(),e.getGrade())
                ));
    }
}
