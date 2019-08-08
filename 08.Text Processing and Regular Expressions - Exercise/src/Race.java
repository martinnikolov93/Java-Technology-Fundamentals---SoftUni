import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static javax.swing.UIManager.get;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,Integer> racers = new LinkedHashMap<>();

        String[] participants = scanner.nextLine().split(", ");

        for (int i = 0; i < participants.length; i++) {
            racers.put(participants[i],0);
        }

        String regex = "(?<name>[A-Za-z]*)(?<distance>[0-9]*)";

        String input = "";

        while (!"end of race".equals(input = scanner.nextLine())) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String racer = "";
                String distanceString = "";

                racer += matcher.group("name");
                distanceString += matcher.group("distance");

                while(matcher.find()){
                    racer += matcher.group("name");
                    distanceString += matcher.group("distance");
                }

                int distance = 0;
                for (int i = 0; i < distanceString.length(); i++) {
                    distance += Character.getNumericValue(distanceString.charAt(i));
                }

                if (racers.containsKey(racer)) {
                    racers.put(racer, racers.get(racer) + distance);
                }

            }
        }

        Map <String,Integer> racersSorted = racers
                .entrySet()
                .stream()
                .sorted((r1,r2) -> r2.getValue().compareTo(r1.getValue()))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));


        int counter = 1;
        for (var entrySet : racersSorted.entrySet()) {

            String asd = "";
            if (counter == 1) {
                asd = "st";
            } else if (counter == 2) {
                asd = "nd";
            } else {
                asd = "rd";
            }

            System.out.printf("%d%s place: %s%n",counter,asd,entrySet.getKey());

            if (counter == 3) {
                break;
            }
            counter++;
        }


    }
}
