package VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = "";

        while(!"End".equals(input = scanner.nextLine())){
            String[] data = input.split("\\s+");

            Vehicle vehicle = new Vehicle(data[0],data[1],data[2],Integer.parseInt(data[3]));

            vehicles.add(vehicle);
        }

        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)) {

            String finalModel = model;
            vehicles
                    .stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);

            model = scanner.nextLine();
        }

        System.out.println(
                String.format("Cars have average horsepower of: %.2f.",
                calcAverage(vehicles
                .stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList()))));

        System.out.println(
                String.format("Trucks have average horsepower of: %.2f.",
                calcAverage(vehicles
                .stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList()))));
    }

    public static double calcAverage (List<Vehicle> vehicles){
        if (vehicles.size() == 0){
            return 0.0;
        }

        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsepower();
        }

        return sum / vehicles.size();
    }
}
