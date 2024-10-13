// Custom Exception for Invalid User Input

// Problem Statement:
// You are developing a user management system where users can register with a unique username. Implement a system where a custom exception is thrown when a user attempts to register with a username that contains forbidden characters or is too short.

// Description:
// Create a custom exception named InvalidUsernameException that extends the Exception class. This exception should be thrown if the username is less than 5 characters long or contains any non-alphanumeric characters. The UserManager class should handle this exception and inform the user of the error.

// Input Format:
// A single line of input, the username to be validated.
// Output Format:
// If the username is valid, output "Username registered successfully."
// If the username is invalid, output "Invalid username: [error details]."

// Sample Input:
// john_doe
// Sample Output:
// Invalid username: Contains non-alphanumeric characters.

//==============================================================================================
//-----------
//Source code:
//----------
//==============================================================================================

import java.util.Scanner;

// Custom Exception Class
class InvalidUsernameException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public InvalidUsernameException(String message) {
        super(message);
    }
  
    //..... YOUR CODE ENDS HERE .....
}

// UserManager Class
class UserManager {
    //..... YOUR CODE STARTS HERE .....
    
    
    public void registerUser(String username) throws InvalidUsernameException {
        if (username.length() < 5) {
            throw new InvalidUsernameException("Too short.");
        }
        if (!username.matches("[a-zA-Z0-9]+")) {
            throw new InvalidUsernameException("Contains non-alphanumeric characters.");
        }
        System.out.println("Username registered successfully.");
    }
    
    
    //..... YOUR CODE ENDS HERE .....
}

// Main Class
public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....


        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        
        String username = scanner.nextLine();
        
        try {
            userManager.registerUser(username);
        } catch (InvalidUsernameException e) {
            System.out.println("Invalid username: " + e.getMessage());
        } finally {
            scanner.close();
        }

        
        //..... YOUR CODE ENDS HERE .....
    }
}

