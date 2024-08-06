package ex_14072024;

import java.util.Locale;

public class Lab077 {
    public static void main(String[] args) {
        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password)); // because in pass_u all are in lower case
        System.out.println(pass_u.equalsIgnoreCase(password)); //ra ignore case and check content

        System.out.println(password); //print from beginindex 1 to endindex 3 (not print end index i.e. upto endindex
        System.out.println(password.indexOf('a')); // find index of 'a' in password: "Pramod@123"
        System.out.println(password.length());




    }
}
