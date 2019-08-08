import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> goods = new LinkedHashMap<>();

        String input = "";

        while(!"stop".equals(input = scanner.nextLine())){
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (goods.containsKey(resource)) {
                goods.put(resource, goods.get(resource) + quantity);
            } else {
                goods.put(resource,quantity);
            }
        }

        goods.entrySet().forEach(r -> System.out.printf("%s -> %d%n",r.getKey(),r.getValue()));
    }
}
