package ex_20072024;


import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object sc
        System.out.println("Enter the number to verify");
        int numb= sc.nextInt(); // Read user input

        if (numb % 2 == 0) {
            System.out.println("Entered number is an Even number");
        } else {
            System.out.println("Entered number is an Odd number");
        }

    }
}


