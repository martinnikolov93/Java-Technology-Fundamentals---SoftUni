import java.util.*;

public class tests {
    public static void main(String[] args) {
        /*Map<String,Integer> someMap = new HashMap<>();

        someMap.put("marti",25);
        someMap.put("desi",25);

        someMap.putIfAbsent("marti",3);

        if (someMap.containsKey("marti")){
            System.out.println("Marti is in.");
        }

        for (Map.Entry<String, Integer> entrySet :
                someMap.entrySet()) {

            System.out.println(entrySet.getKey() + " - " + entrySet.getValue());
        }

        System.out.println(someMap);*/

        List <Double> someList = new ArrayList<>(Arrays.asList(1.00,2.00,3.00));

        Double average = someList.stream().mapToDouble(g -> g).average().getAsDouble();
    }
}
