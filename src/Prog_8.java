import java.util.Scanner;

public class Prog_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Largest Digit : " + largestDigit(num));
    }

    public static int largestDigit(int n) {

        int rem_o = 0;
        while (n != 0) {
            int rem_n = n%10;
            if (rem_n < rem_o) {
                rem_n = rem_o;
            }
            rem_o = rem_n;
            n /= 10;
        }
        return rem_o;
    }
}
