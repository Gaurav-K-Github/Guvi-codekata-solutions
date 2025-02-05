import java.util.*;

public class Main {
    public static void main(String[] args) {
       //..... YOUR CODE STARTS HERE .....
       
       Scanner sc = new Scanner(System.in);
        
        // Read the number of words
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline after the integer input
        
        // Read the words from input
        String[] words = sc.nextLine().split(" ");
        
        // Create a frequency map to store word frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Iterate over the words and populate the frequency map
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Output the words and their frequencies
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       
       //..... YOUR CODE ENDS HERE .....
    
       
       //..... YOUR CODE ENDS HERE .....
    }
}
