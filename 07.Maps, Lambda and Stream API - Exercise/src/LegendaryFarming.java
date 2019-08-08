import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);

        Map<String,Integer> junkMaterials = new HashMap<>();

        boolean legendaryObtained = false;

        while (true) {
            String[] data = scanner.nextLine().split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){

                    if (!keyMaterials.containsKey(material)){
                        keyMaterials.put(material,quantity);
                    } else {
                        keyMaterials.put(material,keyMaterials.get(material) + quantity);
                    }

                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material,keyMaterials.get(material) - 250);

                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }

                        legendaryObtained = true;

                        break;
                    }
                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material,quantity);
                    } else {
                        junkMaterials.put(material,junkMaterials.get(material) + quantity);
                    }

                }
            }

            if (legendaryObtained){
                break;
            }
        }

        keyMaterials
                .entrySet()
                .stream()
                .sorted((m1,m2) -> m1.getKey().compareTo(m2.getKey()))
                .sorted((m1,m2) -> m2.getValue().compareTo(m1.getValue()))
                .forEach(m -> System.out.printf("%s: %d%n",m.getKey(),m.getValue()));

        junkMaterials
                .entrySet()
                .stream()
                .sorted((m1,m2) -> m1.getKey().compareTo(m2.getKey()))
                .forEach(m -> System.out.printf("%s: %d%n",m.getKey(),m.getValue()));

    }
}
