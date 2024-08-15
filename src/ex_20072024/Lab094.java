package ex_20072024;


import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // check user input char is a vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char , to verify it is vowel");
       char vowell = sc.next().charAt(0); //get te string and check the first char
        //user may enter the char as A, E also. so convert to small letter to compare
       //char vowell = sc.next().toLowerCase().charAt(0); //get te string and check the first char


        System.out.println("Entered char "+ vowell);

        switch (vowell) {
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;

            case 'i':
                System.out.println("i is a vowel");
                break;

            case 'o':
                System.out.println("o is a vowel");
                break;

            case 'u':
                System.out.println("u is a vowel");
                break;

            default:
                System.out.println("Not a vowel. It is a consonant");

        }

    }
}
