import java.util.Scanner;

/*Write a java program to check if a number is divisible by 3 and 7 but not divisible by11*/
public class divisibleBy3and7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number = ");
        int number = scn.nextInt();
        if(number%3==0&&number%7==0&&number%11!=0){
            System.out.println("number is divisible by 3 and 7 but not divisible by\n" +
                    "11.");

        }else {
            System.out.println("number is not divisible by 3 and 7");
        }
    }
}
