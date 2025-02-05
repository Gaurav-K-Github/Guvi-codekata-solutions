import java.util.*;
import java.util.function.Predicate;

@FunctionalInterface
interface Condition {
    //..... YOUR CODE STARTS HERE .....
    
    boolean test(int number);

    
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner sc = new Scanner(System.in);
        
        // Input number of integers
        int n = sc.nextInt();
        
        // Input the list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        
        // Step 2: Implement the Condition interface using a lambda expression to filter out even numbers
        Condition isOdd = (int number) -> number % 2 != 0;
        
        // Step 3: Filter the list and print only odd numbers
        numbers.stream()
               .filter(isOdd::test)  // Use the lambda to filter
               .forEach(System.out::println);  // Print each odd number
           
        
        //..... YOUR CODE ENDS HERE .....
    }
}
