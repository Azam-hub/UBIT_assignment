import java.util.Scanner;

public class WattCalculator {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Ampere: ");
        double amp = reader.nextDouble();
        
        System.out.print("Enter Volts: ");
        double volts = reader.nextDouble();

        double watts = amp * volts;
        System.out.print("The value of watt is: " + watts + " watts");
    }
}
