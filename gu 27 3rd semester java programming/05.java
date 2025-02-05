import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        int n = scanner.nextInt();
        
        
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            if (score == -1) {
                break;
            }
            
            if (score >= 90 && score <= 100) {
                System.out.println("Excellent");
            } else if (score >= 75 && score <= 89) {
                System.out.println("Good");
            } else if (score >= 50 && score <= 74) {
                System.out.println("Average");
            } else if (score >= 35 && score <= 49) {
                System.out.println("Pass");
            } else if (score >= 0 && score <= 34) {
                System.out.println("Fail");
            } else {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        }

    
        
        
        
        //..... YOUR CODE ENDS HERE .....
        scanner.close();
    }
}
