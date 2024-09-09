// Problem Statement:
// Read a string from the user and count the number of unique words using a Set.

// Description:
// You need to read a string of text from the user and count how many unique words are present in it. Words are considered case-insensitive and separated by spaces. Use Java's Set interface to achieve this.

// Input Format:
// The input consists of a single line containing a string of words.
// Output Format:
// Print the number of unique words in the string.

// Sample Input:
// Hello world hello
// Sample Output:
// 2

//==============================================================================================
//-----------
//Source code:
//----------

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
