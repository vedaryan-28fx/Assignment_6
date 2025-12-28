import java.util.Scanner;

public class Prog_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides:");
        int n = sc.nextInt();
        System.out.print("Enter length of each side: ");
        int side = sc.nextInt();

        System.out.println("Area of the regular polygon: " + area(n,side));

    }

    public static double area(int n, double side) {

        double area = (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }
}
