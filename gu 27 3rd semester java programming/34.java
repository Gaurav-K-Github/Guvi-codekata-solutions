import java.util.*;

public class Main {
    public static void main(String[] args) {
       //..... YOUR CODE STARTS HERE .....
       

        // Create a Scanner object to read input

        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // List to store the words
        List<String> words = new ArrayList<>();
        
        // Read each word line by line
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            words.add(word);  // Add the word to the list
        }
        
        // Close the scanner
        scanner.close();
        
        // Initialize variables to find the longest words
        int maxLength = 0;
        List<String> longestWords = new ArrayList<>();
        
        // Iterate through the list to find the longest words
        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;  // Update the maximum length
                longestWords.clear(); // Clear the list as we found a longer word
                longestWords.add(word); // Add the new longest word
            } else if (length == maxLength) {
                longestWords.add(word); // Add the word if it matches the max length
            }
        }
        
        // Print the longest words
        
        for (String longestWord : longestWords) {
            System.out.println(longestWord);
        }
    
       
       
      //..... YOUR CODE ENDS HERE .....
    }
}
