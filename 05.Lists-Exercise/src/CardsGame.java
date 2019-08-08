import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cards1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cards2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int card1,card2;

        int counter = 1;
        while (true) {
            if (counter % 2 == 0) {
                card1 = cards1.get(0);
                card2 = cards2.get(0);

                if (card1 > card2) {
                    cards1.add(card1);
                    cards1.add(card2);

                } else if (card2 > card1) {
                    cards2.add(card1);
                    cards2.add(card2);
                }

            } else {
                card1 = cards2.get(0);
                card2 = cards1.get(0);

                if (card1 > card2) {
                    cards2.add(card1);
                    cards2.add(card2);

                } else if (card2 > card1) {
                    cards1.add(card2);
                    cards1.add(card1);
                }
            }



            cards1.remove(0);
            cards2.remove(0);

            if (cards1.size() == 0 || cards2.size() == 0){
                break;
            }

        counter++;
        }

        int sum = 0;

        if (cards1.size() == 0) {
            for (int i = 0; i < cards2.size(); i++) {
                sum += cards2.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
        if (cards2.size() == 0) {
            for (int i = 0; i < cards1.size(); i++) {
                sum += cards1.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }
}
