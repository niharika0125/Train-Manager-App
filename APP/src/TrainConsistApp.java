import java.util.Set;
import java.util.HashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Program continues
        System.out.println("\nSystem ensures all bogie IDs are unique.");
    }
}