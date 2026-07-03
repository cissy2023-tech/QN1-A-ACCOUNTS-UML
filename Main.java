package vu.statement;

/**
 *
 * @author NAMPEERA CISSY
 */
public class Main {
    

    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer("Nampeera Cissy");

        // Create accounts
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 5);
        CurrentAccount current = new CurrentAccount("CA001", 500, 300);

        // Add accounts to the customer
        customer.addAccount(savings);
        customer.addAccount(current);

        // Deposit money
        
        
        savings.deposit(500);
        current.deposit(200);

        // Withdraw money
        System.out.println("Savings Withdrawal: " + savings.withdraw(1200));
        System.out.println("Current Withdrawal: " + current.withdraw(800));

        // Add interest to savings account
        savings.addInterest();

        // Display statements
        System.out.println("\n--- Savings Account Statement ---");
        System.out.println(savings.generateStatement());

        System.out.println("\n--- Current Account Statement ---");
        System.out.println(current.generateStatement());

        // Display customer's total worth
        System.out.println("\nCustomer Total Worth: " + customer.totalWorth());
    }
}
    
