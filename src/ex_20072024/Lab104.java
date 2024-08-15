package ex_20072024;

public class Lab104 {
    public static void main(String[] args) {
        // write a pgm to find the largest among three number

        int a = 35; int  b = 25; int c = 25;

        if (a>b && a>c) {
            System.out.println("a is greater than b and c ");

        } else if (b>a && b>c) {
            System.out.println("b is greater than a and c ");
        } else if (c>a && c>b)  {
            System.out.println("c is greater than a and b ");
        } else if (a==b &&  a>c){
            System.out.println(" a, b are equal and greater among a, b, c");
        } else if (a==b && a<c) {
            System.out.println(" a, b are equal , but c is greater among a, b, c");
        } else if (a==c && a>b) {
            System.out.println(" a, c are equal and greater among a, b, c");
        }else if (a==c && a<b) {
            System.out.println(" a, c are equal, but b is greater among a, b, c");
        }else if (b==c && b>a) {
            System.out.println ("b, c are equal but a is greater among a, b, c");
        }else if (b==c && b<a) {
            System.out.println("b, c are equal and greater among a, b, c");
        } else {
            System.out.println("a, b, c are equal");
        }
        
    }
}
