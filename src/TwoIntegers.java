// write a application that asks the users to enter two integers, obtain them from the users and prints the
// square of each, the sum of their square and the differences of square.

import java.util.Scanner;  // program uses class scanner
public class TwoIntegers {

    // main method begins the execution of the java application
    public static void main(String[] args){
        // create class scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);
        int num1, num2, square1, square2, sum, difference;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        square1 = num1 * num1;
        square2 = num2 * num2;
        sum = square1 + square2;
        difference = square2 - square1;

        System.out.printf("The square of num1 is %d%n :, The square of num2 is %d%n :  ", square1, square2);
        System.out.printf("The sum of square1 and square2 is %d%n :, The difference of square1 and square2 is %d%n :  ", sum, difference);




    }
}
