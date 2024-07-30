package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        char c = '\n'; //New line or next line
        char c1 = '\t'; // to add TAB
        char c2 = '\b'; // Backspace, delete one character
        char c3 = '\r'; // backspace, delete one word
        System.out.println("Pramod"+ c3 +"Dutta"); //op: Dutta
        System.out.println("Pramod"+ c2+"Dutta"); //op: PramoDutta

        char c4 = '\''; //Inserts a single quote
        char c5 = '\"'; //Inserts a double quote
        char c6 = '\\';  // Inserts a backslash
        System.out.println("Pramod"+ c6 +"Dutta");
        System.out.println("--1---");
        System.out.println("Pramod"+ "\n" +"Dutta");
        System.out.println("Pramod"+ "\r" +"Dutta");
        System.out.println("Pramod"+ "\b" +"Dutta");
        System.out.println("--2---");
        System.out.println("sundara"+"subramanian"+"\r"+ "Nellainayagam");

        String c7 = "carriage\rreturn";
        System.out.println(c7);
        System.out.println("--3---");



    }
}
