//Problem Statement
// Write a program that takes two floating-point numbers as input, performs bitwise operations by converting them to integers, and outputs the results in a specific format.

// Description
// You need to declare two floating-point variables, convert them to integers, perform the following bitwise operations, and print the results:

// Perform bitwise AND on the two integers.
// Perform bitwise OR on the two integers.
// Perform bitwise XOR on the two integers.
// Perform bitwise NOT on the first integer and AND it with the second integer.
// Input Format
// Two floating-point numbers, each on a new line.

// Output Format
// Four lines of output, each showing the result of the respective operations in the following format:
// Bitwise AND result: <result>
// Bitwise OR result: <result>
// Bitwise XOR result: <result>
// Bitwise NOT and AND result: <result>

// Sample Input:
// 5.5
// 3.3

// Sample Output:
// Bitwise AND result: 1
// Bitwise OR result: 7
// Bitwise XOR result: 6
// Bitwise NOT and AND result: 2

//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        
        int n1 = (int) f1;
        int n2 = (int) f2;
        
        //..... YOUR CODE STARTS HERE .....
        int bitwiseAnd = n1 & n2;
        int bitwiseOr = n1 | n2;
        int bitwiseXor = n1 ^ n2;
        int bitwiseNotAnd = (~n1) & n2;
        
        System.out.println("Bitwise AND result: " + bitwiseAnd);
        System.out.println("Bitwise OR result: " + bitwiseOr);
        System.out.println("Bitwise XOR result: " + bitwiseXor);
        System.out.println("Bitwise NOT and AND result: " + bitwiseNotAnd);
        
        sc.close();
        

        //..... YOUR CODE ENDS HERE .....
    }
}