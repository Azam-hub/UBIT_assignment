import java.util.Scanner;

public class GivenIntToZero {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter integer: ");
        int a = reader.nextInt();

        if (a >= 0) {
            while (a >= 0) {
                System.out.println(a);
                a--;
            }
        } else {
            while (a < 0) {
                System.out.print("Enter integer again: ");
                a = reader.nextInt();
                if (a >= 0) {
                    while (a >= 0) {
                        System.out.println(a);
                        a--;
                    }
                    break;
                }
            }
        }
    
    }
}
