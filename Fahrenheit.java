import java.util.Scanner;

//Write a Java program to change temperature from Fahrenheit to Celsius.
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter temperature in fahrenheit :");
        double Fahrenheit = scn.nextDouble();
        double celsius = (Fahrenheit - 32)*5.0/9.0;
        System.out.println("temperature in Fahrenheit is " +Fahrenheit);
        System.out.println("temperature in celsius is " + celsius);
    }
}
