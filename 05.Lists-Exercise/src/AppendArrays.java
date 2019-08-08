import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = numbers.size() - 1; i >= 0; i--) {
            List<String> splitedNumbers = Arrays.stream(numbers.get(i).split("\\s+")).collect(Collectors.toList());

            for (int j = 0; j < splitedNumbers.size(); j++) {
                if (splitedNumbers.get(j).equals("")) {
                    splitedNumbers.remove(j);
                }
            }

            for (int j = 0; j < splitedNumbers.size(); j++) {

                System.out.print(splitedNumbers.get(j) + " ");
            }
        }
    }
}
