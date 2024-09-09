//Problem Statement:
// You are designing a banking application where users can withdraw money from their account. Implement a custom exception that is thrown if a withdrawal amount exceeds the account balance.

// Description:
// Create a custom exception named InsufficientFundsException that extends Exception. This exception should be thrown if a withdrawal attempt exceeds the account balance. The BankAccount class should handle this exception and provide appropriate feedback.

// Input Format:
// The initial balance of the account (a floating-point number).
// The withdrawal amount (a floating-point number).
// Output Format:
// If the withdrawal amount is valid, output "Withdrawal successful. Remaining balance: [amount]."
// If the withdrawal amount exceeds the balance, output "Insufficient funds: [error details]."

// Sample Input 1:
// 500
// 600
// Sample Output 1:
// Insufficient funds: Withdrawal exceeds balance.

// Sample Input 2:
// 200
// 200
// Sample Output 2:
// Withdrawal successful. Remaining balance: 0.0

//==============================================================================================
//-----------
//Source code:
//----------

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
