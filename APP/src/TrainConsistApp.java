import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TrainConsistApp {

    // Bogie class with name and capacity
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a list to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with their seating capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));

        System.out.println("\nPassenger Bogies (unsorted):");
        System.out.println(passengerBogies);

        // Sort bogies by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nPassenger Bogies sorted by capacity (ascending):");
        System.out.println(passengerBogies);

        System.out.println("\nSystem successfully sorts bogies based on seating capacity.");
    }
}
