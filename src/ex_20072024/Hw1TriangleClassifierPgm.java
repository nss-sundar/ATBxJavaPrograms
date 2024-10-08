package ex_20072024;

public class Hw1TriangleClassifierPgm {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->

        int side1 = 17;  int side2 = 117; int side3 = 7;

        if (side1 == side2  && side2 == side3) {
            System.out.println("Equilateral Triangle - all sides match");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle - two sides match");
        } else if (side1 != side2  || side2 != side3 || side1 != side3) {
            System.out.println("Scalene Triangle - no sides match");
        }



    }
}
