// Compare integers using if statements, relational operators and equality operators

import java.util.Scanner;   // program uses class scanner
public class comparison {
    // main method begins execution of java application
    public static void main(String[] args){
        // create a scanner to get input from the command line
        Scanner input = new Scanner(System.in);

        int num1; // first number to compare
        int num2; // second number to compare

        System.out.print("Enter the first integer: "); // prompt
        num1 = input.nextInt();    // reads the first number from the user

        System.out.print("Enter the second integer: ");  // prompt
        num2 = input.nextInt(); // reads the second number from the user

        if(num1 == num2)
            System.out.printf("%d == %d%n", num1,num2);

        if(num1 != num2)
            System.out.printf("%d != %d%n", num1,num2);

        if(num1 < num2)
            System.out.printf("%d < %d%n", num1,num2);

        if(num1 > num2)
            System.out.printf("%d > %d%n", num1,num2);

        if(num1 <= num2)
            System.out.printf("%d <= %d%n", num1,num2);

        if(num1 >= num2)
            System.out.printf("%d >= %d%n", num1,num2);

    }
}
