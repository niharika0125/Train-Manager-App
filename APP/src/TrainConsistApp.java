import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

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
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("Executive", 80));

        System.out.println("\nOriginal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Filter bogies with capacity greater than 60
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Passenger Bogies (capacity > 60):");
        System.out.println(highCapacityBogies);

        System.out.println("\nOriginal list remains unchanged:");
        System.out.println(passengerBogies);
    }
}
