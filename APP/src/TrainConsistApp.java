import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Create list (reuse from UC7)
        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("Executive", 80));

        System.out.println("Original Passenger Bogies:");
        System.out.println(passengerBogies);

        // UC8: Filtering using Stream
        List<Bogie> filteredBogies = passengerBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (capacity > 60):");
        System.out.println(filteredBogies);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering:");
        System.out.println(passengerBogies);
    }
}
