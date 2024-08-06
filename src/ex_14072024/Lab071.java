package ex_14072024;

public class Lab071 {
    public static void main(String[] args) {

        String s1 = "Pramod";
        String s2 = s1;
        System.out.println(s2); // upto this line 1 string is created for Pramod

        String s3 = s2.toLowerCase(); // upto this line 2 string is created for Pramod, pramod
        System.out.println(s3);
        System.out.println(s1);
        
    }
}
