import java.util.Scanner;
//Write a Java program to find area and perimeter of a circle.
public class circle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter radius :");
        double radius= scn.nextDouble();
        final double PI = 3.14;

        double area = (PI * radius*radius);

        System.out.println("Area of circle is "+area);

    }
}
