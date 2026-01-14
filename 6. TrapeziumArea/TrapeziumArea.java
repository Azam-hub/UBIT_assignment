import java.util.Scanner;

public class TrapeziumArea {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter length of one of parallel sides: ");
        double l1 = reader.nextDouble();
        
        System.out.print("Enter length of another parallel side: ");
        double l2 = reader.nextDouble();
        
        System.out.print("Enter Height (perpendicular distance between sides): ");
        double h = reader.nextDouble();
        

        double area = h * (l1 + l2) / 2;
        System.out.print("Area of trapezium is: " + area);
    }
}
