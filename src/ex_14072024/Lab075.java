package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {

        String s1 = new String("pramod");
        String s2 = new String("pramod");
        String s3 = new String("pramod");

        System.out.println( s3 == s2); //false as it check for the reference area it stores
        System.out.println( s2 == s1); //false as it check for the reference area it stores



    }
}
