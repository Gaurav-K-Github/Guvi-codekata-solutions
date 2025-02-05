import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of levels
        int n = scanner.nextInt();
        
        // Generate the pyramid pattern
        for (int i = 1; i <= n; i++) {
            // Determine the symbol to use for the current level
            char symbol = (i % 2 == 1) ? '*' : '#';
            
            // Print the symbol i times (i is the current level number)
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            
            // Move to the next line after printing each level
            System.out.println();
        }
        
        scanner.close();

        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
