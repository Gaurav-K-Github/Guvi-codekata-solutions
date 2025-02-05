import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        try {

            int dividend = scanner.nextInt();
            

            int divisor = scanner.nextInt();
            
            int result = dividend / divisor;
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter integers only.");
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
            
        } finally {
            scanner.close();
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
