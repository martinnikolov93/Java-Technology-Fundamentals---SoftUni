import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int dotIndex = input.lastIndexOf('.');
        String fileName = input.substring(input.lastIndexOf('\\') + 1,dotIndex);
        String fileExtension = input.substring(dotIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
