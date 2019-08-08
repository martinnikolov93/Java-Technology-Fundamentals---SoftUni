import java.util.Scanner;

public class Heart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = -3*n/2; i <= n; i++) {
            for (int j = -3*n/2; j <= 3*n/2; j++) {

                // inside either diamond or two circles
                if ((Math.abs(i) + Math.abs(j) < n)
                        || ((-n/2-i) * (-n/2-i) + ( n/2-j) * ( n/2-j) <= n*n/2)
                        || ((-n/2-i) * (-n/2-i) + (-n/2-j) * (-n/2-j) <= n*n/2)) {
                    System.out.print("O ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}