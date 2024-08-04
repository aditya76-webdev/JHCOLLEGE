import java.util.Scanner;
//Write a Java Program to check if a number is Positive or Negative.
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number = ");
        int number = scn.nextInt();
        if(number>0){
            System.out.println("number is Positive");
        }else{
            System.out.println("number is Negative");
        }
    }
}
