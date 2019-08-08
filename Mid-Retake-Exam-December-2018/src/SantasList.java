/*You will receive the initial list with noisy kids each of them separated with "&".
        After that you will receive 4 types of commands until you receive "Finished!"
        •	Bad {kidName} - adds a kid at the start of the list.  If the kid already exists skip this line.
        •	Good {kidName} - removes the kid with the given name only if he exists in the list, otherwise skip this
        line.
        •	Rename {oldName} {newName} – if the kid with the given old name exists change his name with the newer one.
        If he doesn't exist skip this line.
        •	Rearrange {kidName} - If the kid exists in the list remove him from his current position and add him at the
        end of the list.*/


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> kids = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input = "";

        while (!"Finished!".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];
            String kidName = data[1];

            switch (command) {
                case "Bad":
                    if (!kids.contains(kidName)) {
                        kids.add(0,kidName);
                    }
                    break;

                case "Good":
                    kids.remove(kidName);
                    break;

                case "Rename":
                    if (kids.contains(kidName)) {
                        String newKidName = data[2];
                        int kidIndex = kids.indexOf(kidName);
                        kids.set(kidIndex,newKidName);
                    }
                    break;

                case "Rearrange":
                    if (kids.contains(kidName)) {
                        kids.remove(kidName);
                        kids.add(kidName);
                    }
                    break;

            }
        }

        System.out.println(kids.toString().replaceAll("[\\[\\]]",""));
    }
}
