//Question:30

//Creating a Frequency Map
// Problem Statement:
// Read a list of words and create a frequency map of each word.

// Description:
// You need to read a list of words from the user and create a map where the keys are the words and the values are their respective frequencies. Use Java's Map interface to store and calculate the frequencies.

// Input Format:
// The first line contains an integer, 
// n (1 ≤ n ≤ 100), denoting the number of words.
// The second line contains 
// n space-separated words.
// Output Format:
// Print each word and its frequency, one per line.

// Sample Input:
// 4
// apple banana apple grape
// Sample Output:
// banana 1
// apple 2
// grape 1

//==============================================================================================
//------------
//Source code:
//------------
//==============================================================================================

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
    }
}
