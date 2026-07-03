
package vu.statement;

/**
 *
 * @author Namppeera Cissy
 */
public abstract class Account implements Statement {
    //protected attributes
    protected String accountNo;
    protected double balance;
    protected double deposit;
    
    
    //constructor
     public Account(String AccountNo, double opening) {
        this.accountNo = AccountNo;
        this.balance = opening;
    }
     
     //Deposit method
     public void deposit(double Amount){
         if(Amount>0){
             balance+=Amount;
         }
     }
      // Abstract withdraw method
    public abstract boolean withdraw(double amount);

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Implementation of generateStatement()
    @Override
    public String generateStatement() {
        return "Account Number: " + accountNo +
               "\nCurrent Balance: " + balance;
    }

}