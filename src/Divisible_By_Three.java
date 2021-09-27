// Write a application that reads an integer and determines and prints whether it is divisible by 3 or not.

import java.util.Scanner;       // program uses class scanner

public class Divisible_By_Three {
    // main method begins execution of java program.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, divisible, rem;

        System.out.print("Enter the number you would like: ");  // prompt
        num1 = input.nextInt();   // read the number from the user

        if(num1 % 3 == 0)
            System.out.printf("The number is divisible by 3.");
        else
            System.out.printf("The number is not divisible by 3.");

    }
}
