import java.util.Scanner;

public class Prog_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of proper divisors of " + a + " = " + sumOfDivisors(a));
        System.out.println("Sum of proper divisors of " + b + " = " + sumOfDivisors(b));

        System.out.println(a + " and " + b + " are Friendly Pairs");
    }

    public static int sumOfDivisors(int n) {

        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static Boolean isFriendlyPair(int a, int b) {

        if ((sumOfDivisors(a) / a) == (sumOfDivisors(b) / b)) {
            return true;
        }
        return false;
    }

}