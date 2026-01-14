

import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Obtained marks: ");
        double om = reader.nextDouble();
        
        while (om < 0) {
            System.out.print("Invalid! Enter Obtained marks again: ");
            om = reader.nextDouble();
        }


        System.out.print("Enter Total marks: ");
        double tm = reader.nextDouble();

        while (tm < 0 || tm < om) {
            System.out.print("Invalid! Enter Total marks again: ");
            tm = reader.nextDouble();
        }

        double percent = (om / tm) * 100;

        System.out.println("Percentage is " + percent + "%");

        
    }
}
