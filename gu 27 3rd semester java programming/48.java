import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        // Read two lines of input, each containing a string representation of an integer
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        
        // Parse the string inputs into integers using Integer wrapper class
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        // Perform arithmetic operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        
        // Handle division with zero check
        String division;
        if (num2 != 0) {
            division = String.valueOf(num1 / num2); // Convert result to String
        } else {
            division = "Cannot divide by zero"; // Handle division by zero
        }
        
        // Print the results of each operation
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        
        scanner.close(); // Close the scanner
        
                
        
        //..... YOUR CODE ENDS HERE .....
    }
}
