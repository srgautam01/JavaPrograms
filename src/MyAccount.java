/*account class with double instance variable balance and a constructor
* and deposit method that performs validation
*
* */
public class MyAccount {
    public String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public MyAccount(String name, double balance){
        this.name = name;  // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it is not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0)  // if the balance is valid
            this.balance = balance;
    }
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) // if deposit amount is valid
            balance = balance + depositAmount; // add it to the balance
    }
    // method returns the account balance
    public double getBalance(){
        return balance;
    }
    // method that sets the name
    public void setName(String name){
        this.name = name;
    }
    // method that returns the name
    public String getName(){
        return name; // give value of name back to caller
    }// end method getName
}// end class account
