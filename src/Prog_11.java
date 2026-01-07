import java.util.Scanner;

public class Prog_11 {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int result = count(str, ch);

        System.out.println("The number of occurrences of '" + ch + "' in \"" + str + "\" is " + result);
    }
}
