import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cards1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        cards1.remove(0);

        System.out.println(cards1.size());
    }
}
