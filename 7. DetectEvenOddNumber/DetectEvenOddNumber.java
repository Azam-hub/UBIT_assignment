import java.util.Scanner;

public class DetectEvenOddNumber {
    public static void main() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int a = reader.nextInt();
        
        if (a % 2 == 0) {
            System.out.print("The entered number is Even!");
        } else {
            System.out.print("The entered number is Odd!");
        }

    }
}
