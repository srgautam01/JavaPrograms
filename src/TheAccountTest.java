/*
* Inputting and outputting floating point numbers with account objects
*
*
* */
import java.util.Scanner;
public class TheAccountTest {
    public static void main(String[] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each object
        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        // create a scanner to  get input from the command window
        Scanner input = new Scanner(System.in);

        System.out.prinf("Enter the deposit amount for the account1:"); // prompt
        double depositAmount = input.nextDouble();  // obtain the user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter the deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble();  // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add account2 balance

        // display balance
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());

    } // end main
} // end class theaccounttest
