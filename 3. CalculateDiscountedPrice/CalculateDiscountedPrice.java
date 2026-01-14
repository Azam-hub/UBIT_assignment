import java.util.Scanner;

public class CalculateDiscountedPrice {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double op = reader.nextDouble();

        System.out.print("Enter discount in (%): ");
        double percentage = reader.nextDouble();

        double sp = op - ((percentage * op) / 100);
        System.out.print("Selling Price after discount is: " + sp);
    }
}
