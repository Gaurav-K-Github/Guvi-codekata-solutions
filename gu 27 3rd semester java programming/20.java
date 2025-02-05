import java.util.Scanner;

class InvalidAgeException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    

    public InvalidAgeException(String message) {
        super(message);
    }


    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
    
        int age = scanner.nextInt();

        try {
            // Validate age and throw custom exception if invalid
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older");
            }
            System.out.println("Age is valid");

        } catch (InvalidAgeException e) {
            // Handle the custom exception and print the message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    

    
        //..... YOUR CODE ENDS HERE .....
    }
}
