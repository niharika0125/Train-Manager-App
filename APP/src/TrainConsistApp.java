import java.util.List;
import java.util.ArrayList;

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

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 36));
        bogies.add(new Bogie("Executive", 80));

        System.out.println("Bogie List:");
        System.out.println(bogies);

        // UC10: Total seat calculation using reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity:");
        System.out.println(totalSeats);
    }
}