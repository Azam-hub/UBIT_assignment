import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Length of first side: ");
        double l1 = reader.nextDouble();

        System.out.print("Enter Length of second side: ");
        double l2 = reader.nextDouble();

        System.out.print("Enter Length of third side: ");
        double l3 = reader.nextDouble();


        double s = (l1 + l2 + l3) / 2;

        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));

        System.out.print("The area of triangle is: " + area);
        

    }
}
