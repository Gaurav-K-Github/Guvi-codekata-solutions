// Problem Statement:
// You are designing a voting system where voters can cast their votes for various candidates. Each voter can vote only once, and the system needs to validate each vote and ensure the following rules are adhered to:

// A vote must be cast for a valid candidate number.
// The total number of votes should not exceed the number of registered voters.
// A vote for a candidate should only be allowed if the candidate's ID is within the valid range.
// Description:
// You need to implement a Java program that:

// Takes the number of registered voters as input.
// Takes the number of candidates as input.
// Takes each vote (candidate ID) as input.
// Outputs whether each vote is valid or invalid based on the rules above.
// Input Format:
// First line: Integer N (Number of registered voters)
// Second line: Integer C (Number of candidates)
// Third line: Integer V (Number of votes)
// Next V lines: Each line contains an integer 
// ID (candidate ID)
// Output Format:
// For each vote, print "VALID" if the vote is valid, otherwise print "INVALID".

// Sample Input:
// 100
// 5
// 4
// 1
// 6
// 3
// 2
// Sample Output:
// VALID
// INVALID
// VALID
// VALID
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of registered voters
        int registeredVoters = scanner.nextInt();
        
        // Input the number of candidates
        int numCandidates = scanner.nextInt();
        
        // Input the number of votes
        int numVotes = scanner.nextInt();
        
        // Variable to count the number of processed votes
        int votesCount = 0;

        // Process each vote
        for (int i = 0; i < numVotes; i++) {
            int candidateID = scanner.nextInt();
            
            // Check if the vote is valid
            if (candidateID >= 1 && candidateID <= numCandidates && votesCount < registeredVoters) {
                System.out.println("VALID");
                votesCount++;  // Increment the vote count
            } else {
                System.out.println("INVALID");
            }
        }
        
        scanner.close();
        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
