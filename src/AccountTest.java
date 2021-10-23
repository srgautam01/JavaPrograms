//// creating and manipulating an account object
//import java.util.Scanner;
//
//public class AccountTest {
//    // main method begins execution of java application
//    public static void main(String[] args){
//        // create a scanner object to obtain input from the command window
//        Scanner input = new Scanner(System.in);
//
//        // create a account object and assign it to myAccount
//        Account myAccount = new Account();
//
//        // display initial value of name(null)
//        System.out.printf("Initial value is: %s%n%n", myAccount.getName());
//
//        // prompt for and read name
//        System.out.println("Please enter the name:");
//        String theName = input.nextLine();  // read a line of text
//        myAccount.setName(theName);  // put theName in myAccount
//        System.out.println(); // output is a blank line
//
//        // display the name stored in object myAccount
//        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
//
//    }
//}   // end class AccountTest
