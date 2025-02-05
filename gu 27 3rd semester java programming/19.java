import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        
        
        String input1 = scanner.nextLine();
        
        
        String input2 = scanner.nextLine();

        try {
            // Parse the inputs as integers
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);

            // Perform division
            int result = a / b;
            System.out.println(result);

        } catch (NumberFormatException e) {
            // Handle invalid input where input is not an integer
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Cannot divide by zero");
        } finally {
            // Always print this message regardless of whether an exception occurred
            System.out.println("Operation Completed");
        }

        scanner.close();
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
