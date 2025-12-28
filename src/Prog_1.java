import java.util.Scanner;

public class Prog_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println(
                    "---------Simple Calculator----------\n" +

                            "1. Addition\n" +
                            "2. Subtraction\n" +
                            "3. Multiplication\n" +
                            "4. Division\n" +
                            "5. Remainder\n" +
                            "6. Square Root\n" +
                            "7. Exit\n"
            );

            System.out.print("Choose an option : ");
            op = sc.nextInt();
            if (op == 6) {
                System.out.print(" Enter a number : ");
                int num = sc.nextInt();
                System.out.println("Result : " + squareRootSimple(num));
            } else if (op == 7) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.print("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number : ");
                int num2 = sc.nextInt();

                System.out.println();

                if (op == 1)
                    System.out.println("Result : " + additionSimple(num1, num2));
                else if (op == 2) {
                    System.out.println("Result : " + substractionSimple(num1, num2));
                } else if (op == 3) {
                    System.out.println("Result : " + multiplicationSimple(num1, num2));
                } else if (op == 4) {
                    if (num2 == 0)
                        System.out.println("Invalid division");
                    else
                        System.out.println("Result : " + divisionSimple(num1, num2));
                } else if (op == 5) {
                    System.out.println("Result : " + remainderSimple(num1, num2));
                }
            }
            System.out.println();
            System.out.println();
        } while (op != 7);
    }

    public static int additionSimple(int x , int y){
        x += y;
        return x;
    }

    public static int substractionSimple(int x , int y){
        return x-y;
    }

    public static int multiplicationSimple(int x , int y){
        return x*y;
    }

    public static double divisionSimple(int x , int y){
        double c = (double) x/y;
        return c;
    }

    public static int remainderSimple(int x , int y){
        return x%y;
    }

    public static double squareRootSimple(int x){
        return Math.sqrt(x);
    }
}