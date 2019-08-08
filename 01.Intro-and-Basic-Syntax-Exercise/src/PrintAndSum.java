import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        for (int i = startNum; i <= lastNum ; i++) {
            totalSum += i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(String.format("Sum: %d",totalSum));
    }
}
