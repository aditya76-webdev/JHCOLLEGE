import java.util.Scanner;

//Write a Java program to swap two numbers without using third variable.
public class Swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = scn.nextInt();
        System.out.print("enter b = ");
        int b = scn.nextInt();
        System.out.println("numbers before swap :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println("numbers after swap :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
