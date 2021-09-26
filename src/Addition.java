// addition program that inputs two numbers then displays their sum.
import java.util.Scanner;   // program uses class scanner

public class Addition {
    // main method uses execution of the java application
    public static void main(String[] args){
        // create a scanner to obtain input from the command window.
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Enter the first number: ");  // prompt
        num1 = input.nextInt();     // read the first number from the user

        System.out.print("Enter the second number: "); // prompt
        num2 = input.nextInt();     // read the second number from the user

        sum = num1 + num2;

        System.out.printf("The sum is %d%n", sum);
    }// end method main
} // end class
