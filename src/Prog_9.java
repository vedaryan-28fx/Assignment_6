import java.util.Scanner;

public class Prog_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        }else
            System.out.println(num + " is a not Palindrome");
    }

    public static int reverse (int num) {

        int rev = 0;
        while (num != 0) {
            int rem = num%10;
            rev = (rev*10) + rem ;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {

        if (num == reverse(num)) {
            return true;
        }
        return false;
    }
}
