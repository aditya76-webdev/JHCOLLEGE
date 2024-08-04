import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter length :");
        double length= scn.nextDouble();
        System.out.print("enter breadth :");
        double breadth= scn.nextDouble();
        double area = (length * breadth);
        double perimeter = 2 *(length + breadth);
        System.out.println("Area of rectangle is "+area);
        System.out.println("perimeter of rectangle is "+perimeter);


    }
}
