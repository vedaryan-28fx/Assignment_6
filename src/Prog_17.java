import java.util.Scanner;

public class Prog_17 {

    public static char middleCharacter(String str) {
        int length = str.length();
            return str.charAt(length / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = sc.nextLine();

        char mid = middleCharacter(str);

        System.out.println("The middle character in the string: " + mid);
    }
}
