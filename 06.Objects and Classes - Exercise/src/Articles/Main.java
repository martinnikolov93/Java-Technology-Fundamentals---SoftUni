package Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Article article = new Article(input.get(0),input.get(1),input.get(2));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            List<String> commands = Arrays.stream(scanner.nextLine().split(": ")).collect(Collectors.toList());

            String command = commands.get(0);
            String value = commands.get(1);

            switch (command){
                case "Edit":
                    article.edit(value);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(value);
                    break;
                case "Rename":
                    article.rename(value);
                    break;
            }
        }

        System.out.println(article);
    }
}
