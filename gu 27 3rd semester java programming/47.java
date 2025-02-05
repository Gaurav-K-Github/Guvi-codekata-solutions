import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        String input = scanner.nextLine();
        
        // Split the input string into an array of strings
        String[] stringArray = input.split(" ");
        
        // Convert the string array to an array of integers using Integer wrapper class
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]); // Parse each string to an integer
        }
        
        // Compute the sum of the integers
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        
        // Find the maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : intArray) {
            if (num > max) {
                max = num; // Update max if the current number is greater
            }
            if (num < min) {
                min = num; // Update min if the current number is lesser
            }
        }
        
        // Compute the average of the integers
        double average = (double) sum / intArray.length; // Cast to double for accurate division
        
        // Print the results
        System.out.println(sum); // Print the sum
        System.out.println(max + " " + min); // Print max and min
        System.out.printf("%.2f\n", average); // Print average rounded to two decimal places
        
        scanner.close(); // Close the scanner
        
        
        //..... YOUR CODE ENDS HERE .....
    
       
        
        //..... YOUR CODE ENDS HERE .....
    }
}
