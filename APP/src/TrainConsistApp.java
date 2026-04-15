import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Sample dataset
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 36));
        bogies.add(new Bogie("Executive", 80));
        bogies.add(new Bogie("General", 60));
        bogies.add(new Bogie("Luxury", 90));

        System.out.println("Original Bogies:");
        System.out.println(bogies);

        // =========================
        // LOOP BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        System.out.println("\nLoop Result:");
        System.out.println(loopResult);
        System.out.println("Loop Time (ns): " + loopTime);

        // =========================
        // STREAM BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("\nStream Result:");
        System.out.println(streamResult);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}