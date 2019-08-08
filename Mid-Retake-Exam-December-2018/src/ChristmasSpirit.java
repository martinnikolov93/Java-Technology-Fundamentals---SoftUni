/*
There are 4 types of decorations and each piece costs a price
        •	Ornament Set – 2$ a piece
        •	Tree Skirt – 5$ a piece
        •	Tree Garlands – 3$ a piece
        •	Tree Lights – 15$ a piece
        Every second day you buy an Ornament Set quantity of times and increase your Christmas spirit by 5.
        Every third day you buy Tree Skirts and Tree Garlands (both quantity of times) and increase your spirit by 13.
        Every fifth day you buy Tree Lights quantity of times and increase your Christmas spirit by 17. If you have
        bought Tree Skirts and Tree Garlands at the same day you additionally increase your spirit by 30.
        Every tenth day you lose 20 spirit, because your cat ruins all tree decorations and you have to rebuild the tree
         and buy one piece of tree skirt, garlands and lights. That is why you are forced to increase the allowed
         quantity with 2 at the beginning of every eleventh day.
        Also if the last day is a tenth day the cat decides to demolish even more and ruins the Christmas turkey and you
         lose additional 30 spirit.
At the end you must print the total cost and the gained spirit.
*/

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int spirit = 0;

        double ornamentSetsCost = 0;
        double treeSkirtsCost = 0;
        double treeGarlandsCost = 0;
        double treeLightsCost = 0;

        for (int day = 1; day <= days; day++) {
            if (day % 11 == 0) {
                quantity += 2;
            }

            if (day % 2 == 0) {
                ornamentSetsCost += quantity * 2.00;
                spirit += 5;
            }

            if (day % 3 == 0){
                treeSkirtsCost += quantity * 5.00;
                treeGarlandsCost += quantity * 3.00;
                spirit += 13;
            }

            if (day % 5 == 0) {
                treeLightsCost += quantity * 15.00;
                if (day % 3 == 0) {
                    spirit += 47;
                } else {
                    spirit += 17;
                }
            }

            if (day % 10 == 0) {
                treeSkirtsCost += 5.00;
                treeGarlandsCost += 3.00;
                treeLightsCost += 15.00;
                spirit -= 20;

                if ((day == days)) {
                    spirit -= 30;
                }
            }


        }

        double totalCost = ornamentSetsCost + treeSkirtsCost + treeGarlandsCost + treeLightsCost;

        System.out.printf("Total cost: %.0f\n" +
                "Total spirit: %d\n",totalCost, spirit);
    }
}
