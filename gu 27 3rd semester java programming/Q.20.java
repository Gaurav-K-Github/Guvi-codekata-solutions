//Problem Statement:
// Create a custom exception called InvalidAgeException. Write a Java program that takes the age of a user as input and throws this custom exception if the age is less than 18. Ensure the program catches the exception and prints an appropriate message.

// Description:
// Define a custom exception InvalidAgeException that extends the Exception class. The program should prompt the user to enter their age. If the age is less than 18, throw the InvalidAgeException with a message "Age must be 18 or older". Catch this exception and print the message to the user.

// Input Format:
// The first line contains an integer, age.
// Output Format:
// If age is 18 or older, print "Age is valid".
// If age is less than 18, print "Age must be 18 or older".

// Sample Input:
// 20
// Sample Output:
// Age is valid

//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

class InvalidAgeException extends Exception {
    //..... YOUR CODE STARTS HERE .....
    
    public InvalidAgeException(String message) {
        super(message);
    }
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
    
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older");
            }
            System.out.println("Age is valid");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    
        //..... YOUR CODE ENDS HERE .....
    }
}
