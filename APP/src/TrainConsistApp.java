import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashMap to store bogie names and their capacities
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogies with their seating/load capacities
        bogieCapacityMap.put("Sleeper", 72);      // 72 seats
        bogieCapacityMap.put("AC Chair", 54);     // 54 seats
        bogieCapacityMap.put("First Class", 36);  // 36 seats

        // Iterate over the map and display bogie capacities
        System.out.println("\nBogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        System.out.println("\nSystem maps each bogie to its capacity successfully.");
    }
}