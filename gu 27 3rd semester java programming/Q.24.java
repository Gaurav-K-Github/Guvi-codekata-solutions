// Handling Multiple Exceptions

// Problem Statement:
// Create a Java program that reads two integers from the user and performs division. Handle ArithmeticException for division by zero and NumberFormatException for invalid integer input. Ensure the program prints a message for each exception and continues execution gracefully.

// Description:
// Your task is to handle multiple exceptions in a Java program. The program should read two integers from the user and perform division. If the user enters a non-integer value, catch the NumberFormatException and display an appropriate message. If the user attempts to divide by zero, catch the ArithmeticException and display an appropriate message. Ensure that the program continues to execute gracefully after handling each exception.

// Input Format:
// The first input is the dividend.
// The second input is the divisor.
// Output Format:
// The output should display the result of the division or an appropriate error message if an exception occurs.

// Sample Input 1:
// 10
// 2
// Sample Output 1:
// Result: 5

// Sample Input 2:
// 10 
// 0
// Sample Output 2:
// ArithmeticException: Division by zero is not allowed.

// Sample Input 3:
// a 
// 5
// Sample Output 3:
// NumberFormatException: Invalid input. Please enter integers only.

//==============================================================================================
//------------
//Source code:
//------------
//==============================================================================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        try {

            int dividend = scanner.nextInt();
            

            int divisor = scanner.nextInt();
            
            int result = dividend / divisor;
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter integers only.");
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
            
        } finally {
            scanner.close();
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
