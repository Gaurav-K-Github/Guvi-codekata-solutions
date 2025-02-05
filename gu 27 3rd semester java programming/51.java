import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        // Input: Reading the number of elements in the list
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Input: Reading the space-separated strings
        String[] stringNumbers = scanner.nextLine().split(" ");
        
        int product = 1; // To hold the product of even integers
        boolean foundEven = false; // Flag to check if we found any even integers
        
        // Process each string representation of a number
        for (String str : stringNumbers) {
            int number = Integer.parseInt(str); // Convert string to integer
            
            // Check if the number is even
            if (number % 2 == 0) {
                product *= number; // Multiply to the product
                foundEven = true; // Mark that we've found an even number
            }
        }
        
        // Output the result
        if (foundEven) {
            System.out.println(product); // Print the product of even integers
        } else {
            System.out.println(0); // Print 0 if no even integers were found
        }
        
        // Close the scanner
        scanner.close();        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
