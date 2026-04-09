import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to maintain insertion order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // will be ignored automatically

        // Display final train formation
        System.out.println("\nFinal Train Formation (in insertion order, no duplicates):");
        System.out.println(trainFormation);

        System.out.println("\nSystem preserves insertion order and prevents duplicate bogies.");
    }
}
