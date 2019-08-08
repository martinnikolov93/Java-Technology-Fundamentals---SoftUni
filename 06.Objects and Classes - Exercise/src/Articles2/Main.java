package Articles2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<ArticleTwo> articles =  new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
            ArticleTwo article = new ArticleTwo(input.get(0),input.get(1),input.get(2));

            articles.add(article);
        }

        String sortCommand = scanner.nextLine();

        switch (sortCommand) {
            case "title":
                articles
                        .stream()
                        .sorted((p1,p2) -> p1.getTitle().compareTo(p2.getTitle()))
                        .forEach(e -> System.out.println(e.toString()));
                break;
            case "content":
                articles
                        .stream()
                        .sorted((p1,p2) -> p1.getContent().compareTo(p2.getContent()))
                        .forEach(e -> System.out.println(e.toString()));
                break;
            case "author":
                articles
                        .stream()
                        .sorted((p1,p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
                        .forEach(e -> System.out.println(e.toString()));
                break;
        }
    }
}
