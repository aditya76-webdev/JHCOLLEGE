import java.util.Scanner;

//Write a Java program to add two numbers.
public class Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = scn.nextInt();
        System.out.print("enter b = ");
        int b = scn.nextInt();

        int addition = a+b;
        System.out.print("addition = "+addition);
    }
}
