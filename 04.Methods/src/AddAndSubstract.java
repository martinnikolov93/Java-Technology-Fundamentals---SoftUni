import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int result;

        result = sumTwoNumbers(firstNum,secondNum) - thirdNum;

        System.out.println(result);
    }

    private static int sumTwoNumbers (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
