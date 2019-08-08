import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i++) {
            if(validateUsername(usernames[i])){
                System.out.println(usernames[i]);
            }
        }
    }

    public static boolean validateUsername (String username) {
        if (!(username.length() >= 3 && username.length() <= 16)){
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i)) && username.charAt(i) != '-' && username.charAt(i) != '_') {
                return false;
            }
        }

        return true;
    }
}
