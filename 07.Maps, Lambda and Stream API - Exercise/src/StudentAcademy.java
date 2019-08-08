import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(student)) {
                students.put(student,new ArrayList<>());
            }
            students.get(student).add(grade);
        }

        Map<String,Double> passedStudents = new LinkedHashMap<>();

        for (var entrySet : students.entrySet()) {

            Double averageGrade = entrySet.getValue().stream().mapToDouble(g -> g).average().getAsDouble();

            if ( averageGrade >= 4.50) {
                passedStudents.put(entrySet.getKey(),averageGrade);
            }
        }

        passedStudents
                .entrySet()
                .stream()
                .sorted((n1,n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(s -> System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue()));

        /*students
                .entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(g -> g).average().getAsDouble() >= 4.50)
                .sorted((s1,s2) -> s1.getValue().stream().mapToDouble(e -> Double.parseDouble(e)).average().getAsDouble())*/

    }
}
