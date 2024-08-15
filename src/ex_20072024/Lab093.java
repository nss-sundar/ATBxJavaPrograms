package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tbe browser name , to execute code");
        String bro = sc.next();
        bro = bro.toLowerCase();

        switch (bro) {

            case "firefox":
                System.out.println("Printing in firefox browser");
                break;

            case "chrome":
                System.out.println("Printing in chrome browser");
                break;

            default:
                System.out.println("Enter valide browser . chrome or firefox");


        }

    }
}
