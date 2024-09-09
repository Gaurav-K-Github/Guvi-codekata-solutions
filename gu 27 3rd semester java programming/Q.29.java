// Problem Statement:
// Find the intersection of two sets of integers.

// Description:
// You need to read two sets of integers from the user and print their intersection. Use Java's Set interface and its operations to achieve this.

// Input Format:
// The first line contains an integer, 
// n (1 ≤ n ≤ 100), denoting the number of elements in the first set.
// The second line contains 
// n space-separated integers.
// The third line contains an integer, 
// m (1 ≤ m ≤ 100), denoting the number of elements in the second set.
// The fourth line contains 
// m space-separated integers.
// Output Format:
// Print the elements in the intersection of the two sets, one per line. If there are no common elements, print "No common elements."

// Sample Input:
// 4
// 1 2 3 4
// 3
// 3 4 5
// Sample Output:
// 3
// 4
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);

        // Read the first set
       
        int n = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextInt());
        }

        // Read the second set
        
        int m = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>();
        
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        // Find the intersection
        set1.retainAll(set2);

        // Print the result
        if (set1.isEmpty()) {
            System.out.println("No common elements.");
        } else {
            for (int element : set1) {
                System.out.println(element);
            }
        }

        scanner.close();
        //..... YOUR CODE ENDS HERE .....
    }
}
