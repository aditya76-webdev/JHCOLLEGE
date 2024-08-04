import java.util.Scanner;

//Write a Java program to check whether a number is divisible by 5 or not.
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number = ");
        int number = scn.nextInt();
        if(number%5==0){
            System.out.println("number is divisible by 5");
        }else {
            System.out.println("number is not divisible by 5");
        }
    }
}
