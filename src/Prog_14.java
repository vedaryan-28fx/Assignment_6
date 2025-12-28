import java.util.Scanner;

public class Prog_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "my to my house";
        System.out.println(My_uppercase(str.trim()));
    }

    public static String C_Uppercase(String str) {

        String res = " ";
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == ' ') {
                res += ch;
                flag = false;
            }
            else if (!flag) {
                res += Character.toUpperCase(ch);
                flag = true;
            }
            else
                res += Character.toLowerCase(ch);
        }

        return res;
    }

    public static String My_uppercase (String str) {

        String res = " ";
        res += Character.toUpperCase(str.charAt(0));
        int end = str.length();

        for (int i = 1; i < end-1 ; i++) {

            if (str.charAt(i) == ' ') {
                res += str.charAt(i);
                res += Character.toUpperCase(str.charAt(i + 1));
                i++;
            }
            else
                res += str.charAt(i);
        }
        res += str.charAt(end-1);

        return res;
    }
}
