import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
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
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 36));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("Original Bogie List:");
        System.out.println(bogies);

        // UC9: Grouping using Stream
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies:");

        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }
}