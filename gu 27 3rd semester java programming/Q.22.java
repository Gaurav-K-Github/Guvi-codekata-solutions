// Custom Exception for Age Verification

// Problem Statement:
// Create a Java program that verifies the age entered by the user. If the age is below 18, throw a custom exception called UnderageException. Handle the exception and display an appropriate message.

// Description:
// Your task is to implement a custom exception in Java. The program should read the age from the user. If the age is below 18, throw a custom exception called UnderageException. Catch the exception and display a message indicating that the user is underage. Ensure that the program continues to execute gracefully after handling the exception.

// Input Format:
// The input consists of a single integer representing the age.
// Output Format:
// The output should display an appropriate message based on the age verification.

// Sample Input 1:
// 17
// Sample output 1:
// UnderageException: Age 17 is below the legal age limit.

// Sample Input 2:
// 20
// Sample output 2:
// Age verification successful.

//==============================================================================================
//------------
//Source code:
//------------
//==============================================================================================

import java.util.Scanner;

class UnderageException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public UnderageException(String message) {
        super(message);
    }
    
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            int age = scanner.nextInt();
            
            // Verify the age
            if (age < 18) {
                // Throw the custom exception if underage
                throw new UnderageException("UnderageException: Age " + age + " is below the legal age limit.");
            } else {
                System.out.println("Age verification successful.");
            }
            
        } catch (UnderageException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
