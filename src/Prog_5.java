import java.util.Scanner;

public class Prog_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Collatz length: " + collatzLength(n));
    }

    public static int collatzLength(int n) {

        int count = 0;
        while (n != 1) {
            if (n %2 == 0 )
                n /= 2;
            else
                n = 3*n + 1;
            count++;
        }
        return count;
    }
}
