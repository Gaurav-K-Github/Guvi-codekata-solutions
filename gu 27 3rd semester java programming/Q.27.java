//Problem Statement:
// Given a list of integers, reorder the list so that all odd numbers come before all even numbers while maintaining the relative order of odd and even numbers.

// Description:
// You need to read a list of integers from the user and reorder it such that all odd numbers come before all even numbers. The relative order of odd and even numbers should be preserved. You must use Java's List interface and iterators.

// Input Format:
// The first line contains an integer, 
// 𝑛 (1 ≤ 𝑛 ≤ 100), denoting the number of elements in the list.
// The second line contains 𝑛 space-separated integers.
// Output Format:
// Print the reordered list, with all odd numbers appearing before all even numbers, maintaining their relative order.

// Sample Input:
// 5
// 4 3 2 1 5
// Sample Output:
// 3 1 5 4 2

//==============================================================================================
//-----------
//Source code:
//----------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Initialize the list to store the integers
        List<Integer> numbers = new ArrayList<>();
        
        // Read the integers and add them to the list
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        
        // Create two lists: one for odd numbers and one for even numbers
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        
        // Separate odd and even numbers while maintaining their relative order
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            } else {
                evenNumbers.add(num);
            }
        }
        
        // Combine the odd and even lists, odd numbers first
        oddNumbers.addAll(evenNumbers);
        
        // Output the reordered list
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
