package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(b);

        byte b1 =10;
        int a1 = b1; //VALID- Implicit casting
        int a2 = (byte) b1; // VALID- Explicit casting

    }
}
