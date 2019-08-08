import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\s[a-z0-9][\\w.-]*@[a-zA-Z]+[-.a-zA-Z]+\\.[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group().trim());
        }
    }
}
