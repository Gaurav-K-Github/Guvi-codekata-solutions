import java.util.Scanner;

public class Guvi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Taking four integers from the user
        System.out.println("Enter four integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        // Performing the required operations
        int result1 = (a + b) * c;
        int result2 = (b - d) / a;
        int result3 = (a * d) + c;
        int result4 = (a + b + c + d) / 2;
        
        // Output: Printing the results in the desired format
        System.out.println("Result of operation 1: " + result1);
        System.out.println("Result of operation 2: " + result2);
        System.out.println("Result of operation 3: " + result3);
        System.out.println("Result of operation 4: " + result4);

        sc.close();
    }
}
