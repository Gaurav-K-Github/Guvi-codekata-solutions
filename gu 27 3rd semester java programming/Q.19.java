// Problem Statement:
// Write a Java program to handle multiple exceptions. The program should take two integers as input from the user and perform division. If the input is invalid, throw a NumberFormatException. If the second integer is zero, throw an ArithmeticException. Ensure that the program uses multiple catch blocks to handle these exceptions and always prints a final message using the finally block.

// Description:
// The program should prompt the user to enter two integers. It should then attempt to divide the first integer by the second. If the user enters a non-integer value, handle the NumberFormatException. If the second integer is zero, handle the ArithmeticException. Regardless of whether an exception occurs or not, print "Operation Completed" using the finally block.

// Input Format:
// The first line contains an integer, a.
// The second line contains an integer, b.
// Output Format:
// If a and b are valid integers and b is not zero, print the result of a / b.
// If a or b is not a valid integer, print "Invalid input".
// If b is zero, print "Cannot divide by zero".
// Always print "Operation Completed" at the end.

// Sample Input:
// 10
// 2
// Sample Output:
// 5
// Operation Completed
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        String input1 = scanner.nextLine();
        
        
        String input2 = scanner.nextLine();

        try {
            // Parse the inputs as integers
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);

            // Perform division
            int result = a / b;
            System.out.println(result);

        } catch (NumberFormatException e) {
            // Handle invalid input where input is not an integer
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Cannot divide by zero");
        } finally {
            // Always print this message regardless of whether an exception occurred
            System.out.println("Operation Completed");
        }

        scanner.close();
       
        
        //..... YOUR CODE ENDS HERE .....
    }
}