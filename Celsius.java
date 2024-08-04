//Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter temperature in Celsius :");
        double Celsius = scn.nextDouble();
        double Fahrenheit = (9.0/5.0)*Celsius +32;
        System.out.println("temperature in celsius is "+Celsius);
        System.out.println("temperature in fahrenheit is "+Fahrenheit);
    }
}
