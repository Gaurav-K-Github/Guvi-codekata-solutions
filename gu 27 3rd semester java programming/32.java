import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        // Read the input line
        
        String input = scanner.nextLine().toLowerCase();  // Convert to lowercase for case insensitivity
        
        // Split the input into words, using regex to remove punctuation
        String[] words = input.split("[^a-zA-Z]+"); // Split by any non-letter character
        
        // Map to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {  // Ensure empty strings are not counted
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        // Create a list from the map entries
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
        
        // Sort the list by frequency (descending) and lexicographically for ties
        wordList.sort((entry1, entry2) -> {
            int freqCompare = entry2.getValue().compareTo(entry1.getValue());  // Compare by frequency
            if (freqCompare == 0) {
                return entry1.getKey().compareTo(entry2.getKey());  // If frequencies are the same, compare lexicographically
            }
            return freqCompare;
        });
        
        // Print the sorted words and their frequencies
        for (Map.Entry<String, Integer> entry : wordList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        // Close the scanner
        scanner.close();
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
