import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //..... YOUR CODE STARTS HERE .....
            
        int oddSum = 0, evenSum = 0;
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            
            
            if (num == -1) {
                break;
            }
            
            
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        
        if (oddSum > evenSum) {
            System.out.println("Odd Sum Greater");
        } else if (evenSum > oddSum) {
            System.out.println("Even Sum Greater");
        } else {
            System.out.println("Equal");
        }
        
        scanner.close();
    
            
            
            //..... YOUR CODE ENDS HERE .....
    }
}
