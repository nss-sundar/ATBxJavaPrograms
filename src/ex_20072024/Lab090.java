package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        // Grade Calculator for students
        // A: 90 to 100; B: 80 - 89; C: 70 - 79; D: 60 - 69; F: 0 - 59;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark secured from 0 to 100");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println ("Grade A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("Grade B");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Grade C");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Grade D");
        } else if (mark >= 0 && mark <= 59) {
            System.out.println("Grade F ");
        } else {
            System.out.println("Please enter a valid mark between 0 to 100");
        }



    }
}
