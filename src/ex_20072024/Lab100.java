package ex_20072024;

public class Lab100 {
    public static void main(String[] args) {

        // jdk >13

        char code = 'A';
        int val = switch (code) {
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);


        };

        System.out.println(val);

    }
}
