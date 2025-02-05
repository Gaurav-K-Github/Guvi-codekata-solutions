import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        
        int n = scanner.nextInt();
        
        // Read the elements into a list
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        // Close the scanner
        scanner.close();
        
        // Lambda expression to calculate the sum of even numbers
        int sumOfEvens = numbers.stream()
                                 .filter(num -> num % 2 == 0)
                                 .reduce(0, Integer::sum);
        
        // Lambda expression to calculate the product of odd numbers
        int productOfOdds = numbers.stream()
                                   .filter(num -> num % 2 != 0)
                                   .reduce(1, (a, b) -> a * b);
        
        // Calculate the difference
        int difference = sumOfEvens - productOfOdds;
        
        // Output the result
        System.out.println(difference);
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
