import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Sample inputs (you can later replace with Scanner)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output
        System.out.println("Train ID: " + trainId);
        System.out.println("Is Train ID Valid? " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Is Cargo Code Valid? " + isCargoValid);
    }
}