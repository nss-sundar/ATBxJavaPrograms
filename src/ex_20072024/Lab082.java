package ex_20072024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        //Condition and Loops
        // what is condition?
        // If age >18 voting is allowed else not allowed
        // If is a condition . It is not a loop;
        //int age =13;

       Scanner sc = new Scanner (System.in);
       System.out.println("Enter your age to check voting eligibility");

        int age = sc.nextInt();

        if (age>18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("Not allowed to vote");
        }


    }
}
