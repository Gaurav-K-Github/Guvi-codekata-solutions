import java.util.*;

public class Main {
    public static void main(String[] args) {
       //..... YOUR CODE STARTS HERE .....
       
       Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        String input = sc.nextLine();
        
        // Split the string into words, convert to lowercase to handle case insensitivity
        String[] words = input.toLowerCase().split("\\s+");
        
        // Use a Set to store unique words
        Set<String> uniqueWords = new HashSet<>();
        
        // Add words to the set
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        // Output the number of unique words
        System.out.println(uniqueWords.size());       
       
       //..... YOUR CODE ENDS HERE .....
    }
}
