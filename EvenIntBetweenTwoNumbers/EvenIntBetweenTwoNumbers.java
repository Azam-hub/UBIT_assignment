// package EvenIntBetweenTwoNumbers;

import java.util.Scanner;

public class EvenIntBetweenTwoNumbers {

    public static void main () {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Starting number: ");
        int a = reader.nextInt();

        System.out.print("Enter Ending number: ");
        int b = reader.nextInt();

        if (a > 0 && b > 0 && a < b) {
            while (a <= b) {
                if (a % 2 == 0) {
                    System.out.println("Even number is: " + a);
                }
                a++;
            }
        } else {

            while (a < 0 || b < 0 || b < a) {
                System.out.print("Enter Starting number again: ");
                a = reader.nextInt();
    
                System.out.print("Enter Ending number again: ");
                b = reader.nextInt();
    
                if (a > 0 && b > 0 && a < b) {
                    while (a <= b) {
                        if (a % 2 == 0) {
                            System.out.println("Even number is: " + a);
                        }
                        a++;
                    }
                    break;
                }
            }
        }


    }
    
}