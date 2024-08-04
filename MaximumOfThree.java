import java.util.Scanner;
//Write a Java program to find maximum of three numbers.
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = scn.nextInt();
        System.out.print("enter b = ");
        int b = scn.nextInt();
        System.out.print("enter c = ");
        int c = scn.nextInt();
        if(a==b && b==c){
            System.out.println("all three numbers are equal");
        }else {
            int check = (a > b) ? a : b;
            int result = check > c ? check : c;
            System.out.println("greatest among three is :"+result);
        }
    }
}
