import java.util.Scanner;

//Write a Java program to check whether a year is leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter year = ");
        int year = scn.nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year +"is a leap year.");
        }else{
            System.out.println(year +" is not a leap year.");
        }
    }
}
