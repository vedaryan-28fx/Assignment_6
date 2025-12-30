import java.util.Scanner;

public class Prog_10 {

    public static double calculateArea(double side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== AREA CALCULATOR (Method Overloading) ===");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square: " + calculateArea(side));
            } else if (choice == 2) {
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle: " + calculateArea(length, width));
            } else if (choice == 3) {
                System.out.print("Enter radius: ");
                float radius = sc.nextFloat();
                System.out.println("Area of Circle: " + calculateArea(radius));
            } else if (choice == 4) {
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + calculateArea(base, height, true));
            } else if (choice == 5) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(" ");

        } while (choice != 5);

    }
}