import java.util.Scanner;

/*13. Write a Java program for following grading
system.
Percentage&gt;=90%: Grade A
Percentage&gt;=80%: Grade B
Percentage&gt;=70%: Grade C
Percentage&gt;=60%: Grade D
Percentage&gt;=40%: Grade E
Percentage&lt;40% : Grade F

 */
public class Percentage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter Percentage = ");
        float Percentage = scn.nextFloat();
        if(Percentage>100){
            System.out.println("Please enter a valid Percentage");
        }
        else if (Percentage >= 90) {
            System.out.println("your grade is A");
        } else if (Percentage >= 80) {
            System.out.println("your grade is B");
        } else if (Percentage >= 70) {
            System.out.println("your grade is C");
        } else if (Percentage >= 60) {
            System.out.println("your grade is D");
        } else if (Percentage >= 50) {
            System.out.println("your grade is E");
        } else {
            System.out.println("your grade is A");
        }

    }
}
