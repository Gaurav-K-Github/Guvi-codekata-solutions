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
        
        int totalOnes = 0; // Variable to hold the total count of 1s
        
        // Process each integer
        for (String str : stringNumbers) {
            int number = Integer.parseInt(str); // Convert string to integer
            String binaryString = Integer.toBinaryString(number); // Convert to binary representation
            int countOfOnes = countOnes(binaryString); // Count the number of 1s
            
            totalOnes += countOfOnes; // Add to the total count
        }
        
        // Calculate the average count of 1s
        double averageOnes = (double) totalOnes / N; // Compute average
        
        // Round to the nearest integer
        int roundedAverage = (int) Math.round(averageOnes);
        
        // Output the result
        System.out.println(roundedAverage);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to count the number of 1s in a binary string
    private static int countOnes(String binaryString) {
        int count = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }
        return count;
                
        
        //..... YOUR CODE ENDS HERE .....
    }
}
