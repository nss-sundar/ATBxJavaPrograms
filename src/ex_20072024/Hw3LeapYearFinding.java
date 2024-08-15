package ex_20072024;

public class Hw3LeapYearFinding {
    public static void main(String[] args) {
        int yr = 2019;

        if (yr % 4 == 0) {

            if (yr % 100 != 0) {

                System.out.println(yr + " is a leap year");

            }

            if (yr % 100 == 0) {

                if (yr % 400 == 0) {
                    System.out.println(yr + " is a Leap year");
                }
            }
        } else {

            System.out.println( yr + " is NOT a Leap Year");
        }
    }
}
