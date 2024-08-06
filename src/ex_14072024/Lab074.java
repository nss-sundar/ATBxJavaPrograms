package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {

        String name = "The Testing Academy";
        String name1 = "The Testing Academy"; // In SCP, since the content is not changed, 1 String is created
        System.out.println( name == name1); // True:It checks for the reference of stored area. both are same.


        String name2 = new String("The Testing Academy");
        System.out.println( name == name2); //False.one is pointing to SCP and other to Heap reference;
        System.out.println(name1.equals(name2)); // now it checks for the content. (not on refernce)





    }
}
