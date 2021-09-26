// Write an application that asks the users to enter one integer, obtains if from the users and displays whether
// the number and its square are greater than, equal to, not equal to, or less than the number 100.

import java.util.Scanner;
public class ComparingIntegers {
    // main method begins execution of java program
    public static void main(String[] args){
        // create scanner to obtain input from the command line.
        Scanner input = new Scanner(System.in);

        int num1;           // first number to take from the user.
        int square;
        int num2 = 100;     // number to compare with first users input

        System.out.print("Enter the number please: "); // it displays what should be entered
        num1 = input.nextInt();     // it takes the number from the user.

        square = num1 * num1;       // square is defined

        if(square > num2)
            System.out.printf("%d > %d%n", square, num2);

        if (square >= num2)
            System.out.printf("%d >= %d%n", square, num2);
        if (square != num2)
            System.out.printf("%d != %d%n", square, num2);

        if (square < num2)
            System.out.printf("%d < %d%n", square, num2);




    }
}
