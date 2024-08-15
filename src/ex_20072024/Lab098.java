package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        // jdk >13

        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003, 004 -> System.out.println("It is a mobile");

            default -> System.out.println("No matching gadget");

        }
    }
}
