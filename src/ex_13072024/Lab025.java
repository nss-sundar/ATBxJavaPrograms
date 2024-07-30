package ex_13072024;

public class Lab025 {
    public static void main(String[] args) {
        int a =10;
        int b= 24;
        int c = a+b;
        System.out.println(c);
        System.out.println(a+b);

        String s1 = "Pramod";
        String s2 = "Dutta";
        System.out.println(s1+s2);


        String s3 ="Amit";
        int x =99;
        int y = 100;
        System.out.println(x+y);
        System.out.println(x+s3);
        System.out.println(s3+x);
        System.out.println(x+y+s3);

        //Note the change carefully here:
        System.out.println(s3+x+y);
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+x+y+s3);

    }
}
