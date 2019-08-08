import java.util.Scanner;

public class DataTypeFinderTwo {
    public static void main(String[] args) {
        // thanks to https://softuni.bg/forum/25484/java-data-type-more-exercises-zadacha-1-data-type-finder
        Scanner scanner = new Scanner(System.in);

        String theVariable = scanner.nextLine();
        while (!theVariable.equals("END")){
            // integer
            try {
                Integer.parseInt(theVariable);
                System.out.printf("%s is integer type%n", theVariable);
                theVariable = scanner.nextLine();
                continue;
            } catch (Exception ignoreError){

            }
            // floating point
            try {
                Double.parseDouble(theVariable);
                System.out.printf("%s is floating point type%n", theVariable);
                theVariable = scanner.nextLine();
                continue;
            } catch (Exception ignoreError){

            }
            // character, Boolean or string
            if (theVariable.length() == 1 && (theVariable.charAt(0) <= 47 || theVariable.charAt(0) >= 58)){
                System.out.printf("%s is character type%n", theVariable);
            } else if (theVariable.toLowerCase().equals("true") || theVariable.toLowerCase().equals("false")){
                System.out.printf("%s is boolean type%n", theVariable);
            } else {
                System.out.printf("%s is string type%n", theVariable);
            }

            theVariable = scanner.nextLine();
        }
    }
}