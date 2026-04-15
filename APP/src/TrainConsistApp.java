class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 54);

            System.out.println("Valid Bogies Created:");
            System.out.println(b1);
            System.out.println(b2);

            // This will throw exception
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }
    }
}