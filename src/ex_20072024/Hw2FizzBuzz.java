package ex_20072024;

public class Hw2FizzBuzz {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number, and
        // for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        for (int numb = 1; numb <= 100; numb++) {

            if (numb%3 == 0  && numb%5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (numb%3 == 0) {
                System.out.println("FIZZ");
            } else if (numb%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numb);
            }

        }
    }


}