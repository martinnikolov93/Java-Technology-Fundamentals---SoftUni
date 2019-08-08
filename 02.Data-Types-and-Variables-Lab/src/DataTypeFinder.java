/*You will receive an input until you receive "END". Find what data type is the input. Possible data types are:
* •	Integer
•	Floating point
•	Characters
•	Boolean
•	Strings
*/

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.matches("\\d+") || input.charAt(0) == '-') {
                System.out.printf("%s is integer type %n", input);
            } else if (input.matches("\\d+(\\.\\d+)")) {
                System.out.printf("%s is floating point type %n", input);
            } else if (input.matches("[A-Z,a-z,-/.]")) {
                System.out.printf("%s is character type %n", input);
            } else if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type %n", input);
            } else if (input.matches(".*(\\w+)") || input.matches("\\W+")) {
                System.out.printf("%s is string type %n", input);
            }

            input = scanner.nextLine();
        }


        /*if (scanner.hasNextInt(Integer.parseInt(input))) {
            *//*int intNum = Integer.parseInt(scanner.next());*//*
            System.out.printf("%d is integer type", input);
        } else if (scanner.hasNextFloat())  {
            double doubleNum = Double.parseDouble(scanner.next());
            System.out.printf("%f is floating point type", doubleNum);
        }*//* else if (scanner.hasNext)  {
            double doubleNum = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.1f is floating point type", doubleNum);
        }*//* else if (scanner.hasNextBoolean())  {
            String booleanValue = scanner.next();
            System.out.printf("%b is boolean type", booleanValue);
        } *//*else if (scanner.hasNext())  {
            String stringValue = scanner.next();
            System.out.printf("%b is string type", stringValue);
        }*/
    }
}
