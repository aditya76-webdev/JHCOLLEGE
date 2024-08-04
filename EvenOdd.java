import java.util.Scanner;
//Write a Java Program to display whether a number is odd or even.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number = ");
        int number = scn.nextInt();
        if(number%2==0){
            System.out.println("number is Even");
        }else{
            System.out.println("number is Odd");
        }


    }
}
