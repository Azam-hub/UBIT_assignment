import java.util.Scanner;

public class CalculateOriginalPrice {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter discounted price: ");
        double dp = reader.nextDouble();

        System.out.print("Enter discount in (%): ");
        double percentage = reader.nextDouble();

        double op = (dp * 100) / (100 - percentage);
        System.out.print("Original Price is: " + op);
    }
}
