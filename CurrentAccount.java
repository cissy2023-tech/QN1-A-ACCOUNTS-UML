package vu.statement;

/**
 *
 * @author NAMPEERA CISSY
 */
public class CurrentAccount extends Account {
    private double overdraft;

    // Constructor
    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }   

// Withdraw method
    @Override
    public boolean withdraw(double amount) {
       if (balance-amount< -overdraft){
           return false;
       }
       balance-=amount;
       return true;
       }
       
    
     
    
    }