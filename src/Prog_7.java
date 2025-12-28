public class Prog_7 {
    public static void main(String[] args) {

        System.out.println("Number of days in year from 2000 to 2020 :- ");
        System.out.println("Year      Days");
        for (int i = 2000; i <=2020; i++) {
            System.out.println(i + "      " + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {

        boolean L_year;
        if (year % 400 == 0){
            L_year = true;
        } else if (year % 100 == 0) {
            L_year = false;
        } else if (year % 4 == 0) {
            L_year = true;
        }else
            L_year = false;

        int res = 365;
        if (L_year)
            res = 366;

        return res;
    }
}
