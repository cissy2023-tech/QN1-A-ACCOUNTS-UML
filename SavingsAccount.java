package vu.statement;

/**
 *
 * @author NAMPEERA CISSY
 */
public class SavingsAccount extends Account {
        // Private attribute
    private double rate;

    // Constructor
    public SavingsAccount(String AccountNo, double opening, double rate) {
        super(AccountNo, opening);
        this.rate = rate;
    }

    // Withdraw method
    @Override
    public boolean withdraw(double amount) {
       if (balance-amount<0){
           return false;
       }
       balance-=amount;
       return true;
    }

    // Add interest
    public void addInterest() {
        balance += balance * (rate / 100);
    }
}
    

