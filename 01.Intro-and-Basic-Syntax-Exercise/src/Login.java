/*You will be given a string representing a username. The password will be that username reversed.
        Until you receive the correct password print on the console "Incorrect password. Try again.".
        When you receive the correct password print "User {username} logged in."
        However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.*/

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder sbUsername = new StringBuilder(username);

        String reversedUsername = sbUsername.reverse().toString();

        for (int i = 1; i <= 4; i++) {
                String password = scanner.nextLine();

                if (password.equals(reversedUsername)) {
                System.out.printf("User %s logged in.",username);
                return;
            } else if (i == 4) {
                System.out.printf("User %s blocked!",username);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}

/* **** ALTERNATIVE *****
for(int i = str.length() - 1; i >= 0; i--)
        {
        reverse = reverse + str.charAt(i);
        }*/
