package AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesCount = Integer.parseInt(scanner.nextLine());

        printMessages(messagesCount);
    }

    private static void printMessages (int n) {
        Message message = new Message();

        for (int i = 0; i < n; i++) {
            System.out.println(message.generateRandomMessage());
        }
    }
}
