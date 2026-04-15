import java.util.List;
import java.util.ArrayList;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return type + "(" + cargo + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Goods bogies list
        List<GoodsBogie> goods = new ArrayList<>();

        goods.add(new GoodsBogie("Rectangular", "Coal"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Box", "Grain"));

        System.out.println("Goods Bogies:");
        System.out.println(goods);

        // UC12: Safety rule validation
        boolean isSafe = goods.stream()
                .allMatch(b -> !b.getType().equals("Cylindrical")
                        || b.getCargo().equals("Petroleum"));

        System.out.println("\nIs Train Safety Compliant? " + isSafe);
    }
}