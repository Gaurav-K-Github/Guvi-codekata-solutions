import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
    Scanner scanner = new Scanner(System.in);

        // Read double value from input
        double doubleValue = scanner.nextDouble();

        // Convert double value to integer using Double.intValue() method
        int doubleToInt = new Double(doubleValue).intValue();

        // Read float value from input
        float floatValue = scanner.nextFloat();

        // Convert float value to integer using Float.intValue() method
        int floatToInt = new Float(floatValue).intValue();

        // Print the integer values and information about rounding or truncation
        System.out.println("Converted Integer from Double: " + doubleToInt);
        System.out.println("Converted Integer from Float: " + floatToInt);
        System.out.println("Note: Data was truncated, not rounded.");
        //..... YOUR CODE ENDS HERE .....
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
