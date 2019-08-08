import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> parkedCars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

            String command = data[0];
            String username = data[1];

            switch (command) {
                case "register":
                    String licensePlate = data[2];
                    if (!parkedCars.containsKey(username)) {
                        parkedCars.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully%n",username,licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",parkedCars.get(username));
                    }
                    break;
                case "unregister":
                    if (parkedCars.containsKey(username)) {
                        parkedCars.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n",username);
                    }
                    break;
            }
        }

        parkedCars.entrySet().forEach(p -> System.out.printf("%s => %s%n",p.getKey(),p.getValue()));
    }
}
