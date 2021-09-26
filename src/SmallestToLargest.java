// An application that reads five integers and determines and prints the largest and smallest integers in the group.
import java.util.Scanner;   // program uses class scanner.

public class SmallestToLargest {
    // main method begins execution of java application.
    public static void main(String[] args){
        // create a scanner to obtain input from command line.
        Scanner input = new Scanner(System.in);

        // numbers to compare with each other.
        int num1,num2,num3,num4,num5,largest,smallest;

        System.out.print("The first number: "); //prompt
        num1 = input.nextInt();   // first integer to be taken from user

        System.out.print("The second number: "); //prompt
        num2 = input.nextInt();   //second integer to be taken from the users

        System.out.print("The third number: "); //prompt
        num3 = input.nextInt();   //third integer to be taken from the users

        System.out.print("The fourth number: "); //prompt
        num4 = input.nextInt();   //fourth integer to be taken from the users

        System.out.print("The fifth number: "); //prompt
        num5 = input.nextInt();   //fifth integer to be taken from the users

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3> largest)
            largest = num3;

        if(num4 > largest)
            largest = num4;

        if(num5 > largest)
            largest = num5;

        System.out.printf("Largest of five integer is %d : ,Smallest of five integer is %d%n : ",largest, smallest);




    }
}
