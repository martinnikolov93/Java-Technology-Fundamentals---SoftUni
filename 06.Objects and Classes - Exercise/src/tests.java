import java.util.Scanner;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String best = "";
        double bestAverage = Double.MIN_VALUE;
        double currentAverage = 0.0;

        int currentQuality = 0;
        int bestBatchQuality = Integer.MIN_VALUE;

        String input = scanner.nextLine(); // промених ти input-а да чете първо

        while (!(input.equals("Bake It!"))) {

            String[] command = input.split("#");

            for (int i = 0; i < command.length; i++) {
                currentQuality += Integer.parseInt(command[i]);
                currentAverage = currentQuality / (float) command.length;
            }
            if (currentAverage > bestAverage) {
                bestAverage = currentAverage;
            }
            if (currentQuality > bestBatchQuality) {
                bestBatchQuality = currentQuality;
                best = input.replace("#", " ");
            }
            if (currentQuality == bestBatchQuality) {
                if (command.length < best.length()) {
                    best = input.replace("#", " ");
                }
            }

            //добавих този скенер отдолу за да не влезне в цикъла ако е Bake It!
            input = scanner.nextLine();

        }
        System.out.printf("Best Batch quality: %d%n", bestBatchQuality);
        System.out.println(best);
    }