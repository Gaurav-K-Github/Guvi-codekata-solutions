import java.util.Scanner;

// Custom Exception Class
class InsufficientFundsException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public InsufficientFundsException(String message) {
        super(message);
    }    
    
    //..... YOUR CODE ENDS HERE .....
}

// BankAccount Class
class BankAccount {
    //..... YOUR CODE STARTS HERE .....
    
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal exceeds balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful. Remaining balance: %.1f\n", balance);
        }
    }

    public double getBalance() {
        return balance;
    }
        
    
    //..... YOUR CODE ENDS HERE .....
}

// Main Class
public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner sc = new Scanner(System.in);
        
        // Input: Initial balance
        double initialBalance = sc.nextDouble();
        
        // Input: Withdrawal amount
        double withdrawalAmount = sc.nextDouble();
        
        // Create a BankAccount object with initial balance
        BankAccount account = new BankAccount(initialBalance);
        
        // Try to withdraw the given amount and handle the custom exception
        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
