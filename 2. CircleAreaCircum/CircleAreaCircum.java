import java.util.Scanner;

public class CircleAreaCircum {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = reader.nextDouble();

        while (radius <= 0) {
            System.out.print("Invalid! Enter radius of circle again: ");
            radius = reader.nextDouble();
        }

        double circum = 2 * 3.142 * radius;
        double area = 3.142 * (radius * radius);

        // System.out.println("Circumference of circle is: " + (Math.round(circum * 100) / 100));
        System.out.println("Circumference of circle is: " + circum);
        System.out.println("Area of circle is: " + area);
    }
}