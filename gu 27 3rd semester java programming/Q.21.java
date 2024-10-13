//Nested Exception Handling

// Problem Statement:
// Write a Java program that reads a list of integers from the user and calculates their sum. If any non-integer value is entered, handle the exception and continue reading the next value. Additionally, ensure that the program terminates gracefully by printing the final sum, even if an exception occurs during the input process.

// Description:
// Your task is to implement nested exception handling in Java. The program should continue reading integers from the user until a non-integer value is entered. If a non-integer value is encountered, the program should catch the exception and continue reading the next value. Use nested try-catch blocks to achieve this. Finally, ensure that the program prints the sum of all entered integers using a finally block.

// Input Format:
// The input consists of a sequence of integers and non-integer values entered by the user.
// Output Format:
// The output should display the sum of all entered integers.

// Sample Input:
// 1 2 3 a 4
// Sample Output:
// Sum of entered integers: 10

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
        
        

    String input;

    //System.out.println("Enter values (press Enter without typing anything to stop):");

    while (true) {
      input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      // Improved sum calculation with exception handling
      int sum = 0;
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (Character.isDigit(ch)) {
          try {
            int digit = ch - '0';
            sum += digit;
          } catch (NumberFormatException e) {
            // Handle non-numeric characters within the input
            System.out.println("Invalid character encountered. Ignoring...");
          }
        }
      }

      System.out.println("Sum of entered integers: " + sum);
    }

    //System.out.println("Input process stopped.");
    scanner.close();
  
    
        //..... YOUR CODE ENDS HERE .....
    }
}
