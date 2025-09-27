import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("David", 30);
        ageMap.put("José", 25);
        ageMap.put("Juan", 35);

        System.out.println("Age Map: " + ageMap);

        // Acceder a un valor
        int aliceAge = ageMap.get("David");
        System.out.println("Edad de David: " + aliceAge);

        // Iterar sobre el mapa
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //ageMap.entrySet().stream().forEach(System.out::println);
    }
}