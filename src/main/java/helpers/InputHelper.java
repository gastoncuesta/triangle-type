package helpers;

import java.util.Scanner;

public class InputHelper {
    public static double getInputValidated(Scanner sc) {
        double number;
        do {
            while (!sc.hasNextDouble()) {
                System.out.println("That's not a number!");
                System.out.println("Please enter a number!");
                sc.next();
            }
            number = sc.nextDouble();
        } while (number <= 0);

        return number;
    }
}
