import java.util.Scanner;

public class Prog_14 {

    public static String toTitleCase(String str) {
        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += ch;
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result += Character.toUpperCase(ch);
                    capitalizeNext = false;
                } else {
                    result += Character.toLowerCase(ch);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String converted = toTitleCase(str);

        System.out.println("Converted string: " + converted);
    }
}
