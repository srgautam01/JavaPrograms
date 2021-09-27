// write an application that reads two integers, determines whether the first number is multiple of the
// second number doubled and prints the result.
import java.util.Scanner;   // program uses class Scanner
public class Multiples {
    // main method begins execution of java application.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // create a Scanner to obtain input from the command window.

        int firstNum, secondNum;

        System.out.println("Enter first number: ");   // prompt
        firstNum = input.nextInt();         // read the first number from the user


        System.out.println("Enter second number: ");   // prompt
        secondNum = input.nextInt();         // read the first number from the user

        if (number(firstNum, secondNum)) {
            System.out.println(firstNum + " is a multiple of " + secondNum);
        } else {
            System.out.println(firstNum + " is not a multiple of " + secondNum);
        }
    }

    private static boolean number(int firstNum, int secondNum) {
        if((firstNum % secondNum) == 0)
            return true;
        else
            return false;

    }
}