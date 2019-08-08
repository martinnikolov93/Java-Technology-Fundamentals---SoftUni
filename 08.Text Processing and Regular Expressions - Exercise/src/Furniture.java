import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.00;

        String regex = ">>(?<product>[\\w ]+)<<(?<price>-?\\+?[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

        List<String> boughtFurniture = new ArrayList<>();

        String input = "";

        while (!"Purchase".equals(input = scanner.nextLine())) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("product");
                boughtFurniture.add(furniture);

                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                sum += price * quantity;
            }

        }

        System.out.println("Bought furniture:");
        boughtFurniture.stream().forEach(f -> System.out.printf("%s%n", f));
        System.out.printf("Total money spend: %.2f", sum);
    }
}
