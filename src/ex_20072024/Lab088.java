package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Get two inputs and find the number is max or min or equals

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numb1");
        int numb1 = sc.nextInt();

        Scanner sc2 = new Scanner (System.in);
        System.out.println("Enter the numb2");
        int numb2 = sc2.nextInt();

//       int res = Math.max(numb1, numb2);  // just learn. pls use if condition as below
//        System.out.println("The maximuum number is :" + res);

        System.out.println(".......................");


        if (numb1 > numb2) {
            System.out.println("numb1 :"+ numb1+ " is bigger than numb2 : " + numb2);
        } else if (numb2 > numb1){
            System.out.println("numb2 :" + numb2+ " is bigger than number 1 : " + numb1);
        } else {
            System.out.println("numb1 :"+ numb1+ " is equal to  numb2 : " + numb2);
        }


    }
}
