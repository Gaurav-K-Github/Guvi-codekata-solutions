// Problem Statement:
// Write a program that generates a pattern based on user input using nested loops. The pattern to be generated is a pyramid where each level contains a specific number of symbols. Each level's pattern should follow a unique rule:

// The number of symbols on each level is equal to the level number.
// The symbol for each level is based on the level number where odd levels use * and even levels use #.
// Description:
// You need to implement a Java program that:

// Takes an integer 
// N (number of levels) as input.
// Generates and prints the pyramid pattern according to the rules described.
// Input Format:
// Single line: Integer 
// N (Number of levels)
// Output Format:
// Pyramid pattern with 
// N levels, where odd levels use * and even levels use #.

// Sample Input:
// 3
// Sample Output:
// *

// ***
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of levels
        int n = scanner.nextInt();
        
        // Generate the pyramid pattern
        for (int i = 1; i <= n; i++) {
            // Determine the symbol to use for the current level
            char symbol = (i % 2 == 1) ? '*' : '#';
            
            // Print the symbol i times (i is the current level number)
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            
            // Move to the next line after printing each level
            System.out.println();
        }
        
        scanner.close();

        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
