/*Yoda is starting his newly created Jedi academy. So, he asked master Ivan Cho to buy the needed equipment.
        The number of items depends on how many students will sign up. The equipment for the Padawan contains lightsabers, belts and robes.
        You will be given the amount of money Ivan Cho has, the number of students and the prices of each item.
        You have to help Ivan Cho calculate if the money he has is enough to buy all of the equipment, or how much more money he needs.
        Because the lightsabres sometimes brake, Ivan Cho should buy 10% more, rounded up to the next integer. Also, every sixth belt is free.*/


import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentAmount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightsaberCost = Math.ceil(studentAmount + (studentAmount*0.10)) * lightsaberPrice;

        double robesCost = studentAmount * robesPrice;

        double totalBeltsPrice = studentAmount * beltsPrice;
        double freeBeltsPrice = Math.floor(studentAmount / 6.00) * beltsPrice;
        double beltsCost = totalBeltsPrice - freeBeltsPrice;

        double totalCost = lightsaberCost + robesCost + beltsCost;
        if (budget >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(totalCost - budget));
        }


    }
}
