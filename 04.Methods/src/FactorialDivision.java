import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calcFactorial(firstNum);
        long secondFactorial = calcFactorial(secondNum);

        double result = (double) firstFactorial / secondFactorial;

        System.out.printf("%.2f",result);
    }

    private static long calcFactorial (long number) {

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }


        return factorial;
    }
}
