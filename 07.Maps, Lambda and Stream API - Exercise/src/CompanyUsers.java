import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new HashMap<>();

        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split(" -> ");

            String companyName = data[0];
            String employeeId = data[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName,new ArrayList<>());
            }

            if (!companies.get(companyName).contains(employeeId)) {
                companies.get(companyName).add(employeeId);
            }

        }

        companies
                .entrySet()
                .stream()
                .sorted((c1,c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> System.out.printf("%s%n-- %s%n",c.getKey(),c.getValue().toString().substring(1,c.getValue().toString().length() - 1).replaceAll(",","\n--")));

    }
}
