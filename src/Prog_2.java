public class Prog_2 {
    public static void main(String[] args) {

        int A_nos = 0;
        System.out.println("Armstrong number from 100 to 10000: ");
        for (int i = 100; i <=10000 ; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                A_nos++;
            }
        }
        System.out.println("Total no. of Armstrong numbers : " + A_nos);
    }

    public static int CountDigits(int num) {

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int Power(int a , int b) {

        int c = (int) Math.pow(a,b);
        return c;
    }

    public static boolean isArmstrong(int num) {

        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum += Power(rem, CountDigits(num));
            num /= 10;
        }

        if (temp == sum) {
            return true;
        }

        return false;
    }
}
