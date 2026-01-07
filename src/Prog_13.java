import java.util.Scanner;

public class Prog_13 {

    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int words = countWords(sentence);

        System.out.println("The number of words in the sentence is " + words);
    }
}
