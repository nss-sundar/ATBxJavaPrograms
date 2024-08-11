package ex_20072024;

public class Lab091 {
    public static void main(String[] args) {
        // Tell me the order of printing for the below:

        if (true) {
            System.out.println("1");

            if (true) {
                System.out.println("2");

                if (true) {
                    System.out.println("3");
                }
            }
        }
        System.out.println(".............................");
        if (true) {
            System.out.println("1");

            if (false) {  // due to false the below lines wont get executed
                System.out.println("2");

                if (true) {
                    System.out.println("3");
                }
            }
        }



    }
}
