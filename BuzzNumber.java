import java.util.Scanner;
//Write a program to check whether a number is Buzz or not.
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();


        if(n%7==0||n%10==7){
            System.out.println(n+" is a buzz number");
        }else{
            System.out.println(n + " is not a buzz number");
        }
    }
}
