import java.util.Scanner;

//Write a Java program to convert miles to kilometers.
public class Miles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("please enter distance in miles :");
        double miles = scn.nextDouble();
        double kilometer =  miles*1.6;
        System.out.println("Distance in kilomete is :" + kilometer);
    }
}
