import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();

        String input = "";

        while (!"buy".equals(input = scanner.nextLine())) {
            String[] data = input.split(" ");

            String product = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (!products.containsKey(product)) {
                products.put(product, new ArrayList<>(/*Arrays.asList(price,quantity)*/ /* 1 row typed*/));
                products.get(product).add(price);
                products.get(product).add(quantity);
            } else {
                products.get(product).set(0,price);
                products.get(product).set(1,products.get(product).get(1) + quantity);
            }
        }

        products.entrySet()
                .forEach(p -> {
                    System.out.printf("%s -> %.2f%n",p.getKey(),p.getValue().stream().reduce(1.0,(a,b) -> a * b));
                });
    }
}
