import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Set<String> shoppingList = new LinkedHashSet<>();
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of operations
        
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Process each operation
        for (int i = 0; i < n; i++) {
            // Read the operation
            String operation = scanner.nextLine();
            
            // Split the operation into command and item
            String[] parts = operation.split(" ", 2); // Split into "ADD"/"REMOVE" and the item
            String command = parts[0];
            String item = parts[1];
            
            if (command.equals("ADD")) {
                // Add the item to the list (duplicates will be ignored)
                shoppingList.add(item);
            } else if (command.equals("REMOVE")) {
                // Remove the item from the list if it exists
                shoppingList.remove(item);
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the final shopping list, joined by commas
        System.out.println(String.join(", ", shoppingList));
     
        //..... YOUR CODE ENDS HERE .....
    }
}
