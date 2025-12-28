public class Prog_3 {
    public static void main(String[] args) {

        System.out.println("First 100 pentagonal numbers : ");

        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i) + "  ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {

        int num_1 = n*(3*n -1);
        return num_1/2;
    }
}
