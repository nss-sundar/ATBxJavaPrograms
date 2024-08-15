package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {

        //write a pgm for collecting name, age, salary from user and print

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your details are :" + name + " "+ age + "  "+ salary);

        sc.close();
    }
}
