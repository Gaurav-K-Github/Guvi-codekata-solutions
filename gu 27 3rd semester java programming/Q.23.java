// Exception Handling in Array Operations

// Problem Statement:
// Write a Java program that performs array operations. The program should read an integer n from the user, create an array of size n, and allow the user to fill the array. If the user tries to access an index outside the array bounds, handle the ArrayIndexOutOfBoundsException and display an appropriate message.

// Description:
// Your task is to implement exception handling for array operations. The program should read the size of the array from the user and then allow the user to fill the array with integers. If the user tries to access or modify an index outside the bounds of the array, catch the ArrayIndexOutOfBoundsException and display a message indicating the error. Ensure the program continues to run gracefully after handling the exception.

// Input Format:
// The first input is an integer n representing the size of the array.
// The next n inputs are the elements of the array.
// The next input is the index of the array.
// Output Format:
// The output should display the elements of the array or an appropriate error message if an out-of-bounds access occurs.

// Sample Input 1:
// 1 
// 100
// 2
// Sample Output 1:
// ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1

// Sample Input 2:
// 3
// 10 20 30
// 1
// Sample Output 2:
// Element at index 1: 20

//==============================================================================================
//-----------
//Source code:
//----------
//==============================================================================================


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        try {
            // Reading the size of the array
            
            int n = scanner.nextInt();
            
            // Create the array and fill it with elements
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Access the element at the given index
            
            int index = scanner.nextInt();
            
            // Display the element at the given index
            System.out.println("Element at index " + index + ": " + arr[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
