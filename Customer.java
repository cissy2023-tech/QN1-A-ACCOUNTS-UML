
package vu.statement;

/**
 *
 * @author NAMPEERA CISSY
 */
import java.util.List;
import java.util.ArrayList;

public class Customer {
   
    // Private attributes
    private String name;
    private List<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account
    public void addAccount(Account CISSY) {
        accounts.add(CISSY);
    }

    // Calculate total worth
    public double totalWorth() {
        double total = 0;

        for (Account account : accounts) {
            total += account.getBalance();
        }

        return total;
    }
}
    

