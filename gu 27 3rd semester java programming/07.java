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
