class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape);
        }
    }

    public String toString() {
        return shape + "(" + (cargo == null ? "No Cargo" : cargo) + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        System.out.println();

        // Program continues normally
        System.out.println("Final Bogies:");
        System.out.println(b1);
        System.out.println(b2);
    }
}