package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {

        int itemcode = 001444;

        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is an Electronic device");
                break;
            case 004, 005, 007:
                System.out.println("It is a Mechanical Device");
                break;

            default:
                System.out.println("No matching gadget");
        }

    }
}


