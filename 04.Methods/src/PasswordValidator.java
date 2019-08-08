import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        passwordValidator(password);
    }

    private static void passwordValidator (String password) {
        boolean passLenght = checkPassLenght(password);
        boolean illegalSymbol = isIllegalSymbol(password);
        boolean twoDigits = countTwoDigits(password);

        if (!passLenght || illegalSymbol || !twoDigits) {
            if (!passLenght) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (illegalSymbol) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!twoDigits) {
                System.out.println("Password must have at least 2 digits");
            }
        } else {
            System.out.println("Password is valid");
        }

    }

    private static boolean checkPassLenght (String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean isDigit(char symbol){
        if("0123456789".indexOf(symbol) == -1){
            return false;
        }
        return true;
    }

    private static boolean isLetter (char letter) {
        if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(letter) == -1) {
            return false;
        }
        return true;
    }

    private static boolean countTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (isDigit(password.charAt(i))) {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIllegalSymbol(String password){

        for (int i = 0; i < password.length(); i++) {

            if (isDigit(password.charAt(i)) || isLetter(password.charAt(i))) {
                //shalqlqlq
            } else {
                return true;
            }
        }

        return false;
    }


}
