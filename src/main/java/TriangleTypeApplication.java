import model.Triangle;

import java.util.Scanner;

public class TriangleTypeApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("DISCOVER THE TRIANGLE TYPE");
        System.out.println("=================================");
        boolean ok = true;

        while (ok) {
            System.out.println("Enter the length of the first side: ");
            double a = sc.nextDouble();
            System.out.println("Enter the length of the second side: ");
            double b = sc.nextDouble();
            System.out.println("Enter the length of the third side: ");
            double c = sc.nextDouble();
            System.out.println("=================================");

            Triangle triangle = new Triangle(a, b, c);

            if (triangle.isNotATriangle()) {
                System.out.println("It's not a triangle");
            } else {
                System.out.println("The triangle is " + triangle.getType());
            }

            System.out.println("=================================");

            System.out.println("Do you want to try again? (y/n)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("n")) {
                ok = false;
            }
        }

    }
}
