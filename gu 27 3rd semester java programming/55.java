import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
         Scanner scanner = new Scanner(System.in);
        
        // Input: Read the number of integers
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Input: Read the space-separated integers
        String[] stringNumbers = scanner.nextLine().split(" ");
        
        // Initialize min and max values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // List to hold the integers
        List<Integer> integers = new ArrayList<>();
        
        // Process each integer
        for (String str : stringNumbers) {
            int number = Integer.parseInt(str); // Convert string to integer
            integers.add(number); // Add the number to the list
            
            // Update min and max values
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        
        // Output the minimum and maximum values
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        
        // Output the sign of each integer
        for (int number : integers) {
            String sign;
            if (number > 0) {
                sign = "Positive";
            } else if (number < 0) {
                sign = "Negative";
            } else {
                sign = "Zero";
            }
            System.out.println(number + ": " + sign);
        }
        
        // Close the scanner
        scanner.close();
                
        
        //..... YOUR CODE ENDS HERE .....
    }
}
