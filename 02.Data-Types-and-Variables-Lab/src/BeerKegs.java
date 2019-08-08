/*Write a program, which calculates the volume of n beer kegs. You will receive in total 3 * n lines. Each three lines
        will hold information for a single keg. First up is the model of the keg, after that is the radius of the keg,
        and lastly is the height of the keg.
        Calculate the volume using the following formula: π * r^2 * h.
        At the end, print the model of the biggest keg.*/


import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggestKegVolume = 0.00;
        String biggestKeg = "";

        for (int i = 1; i <= n; i++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * (kegRadius * kegRadius) * kegHeight;

            if (kegVolume > biggestKegVolume) {
                biggestKegVolume = kegVolume;
                biggestKeg = kegModel;
            }
        }

        System.out.println(biggestKeg);
    }
}
