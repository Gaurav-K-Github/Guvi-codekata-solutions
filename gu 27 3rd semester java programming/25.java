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
