import java.util.*;

public class Main {
    public static void main(String[] args) {
       //..... YOUR CODE STARTS HERE .....
       
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Read the words into an array
        String[] words = scanner.nextLine().split(" ");
        
        // Map to group words by their length
        Map<Integer, List<String>> wordLengthMap = new HashMap<>();
        
        // Process each word
        for (String word : words) {
            int length = word.length();
            
            // If the map already has this length, add the word to the list, otherwise create a new list
            wordLengthMap.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the grouped words by length
        for (Map.Entry<Integer, List<String>> entry : wordLengthMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
       
       //..... YOUR CODE ENDS HERE .....
    }
}
