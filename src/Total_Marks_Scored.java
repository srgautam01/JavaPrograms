// Calculate the total marks obtained in three tests.
import java.util.Scanner;         // Program uses Scanner

public class Total_Marks_Scored {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // create scanner to obtain input from the command window

        int t1,t2,t3, total;

        System.out.print("Enter the marks in first test: ");  // prompt from the input
        t1 = input.nextInt();

        System.out.print("Enter the marks in first test: "); // prompt from the input
        t2 = input.nextInt();

        System.out.print("Enter the marks in first test: "); // prompt from the input
        t3 = input.nextInt();

        total = t1 + t2 + t3;

        System.out.printf("Total marks: %d%n", total);
    } // end main method
}  // end class total
