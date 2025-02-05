import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the list
        int n = scanner.nextInt();

        // Create a HashSet to store unique integers
        Set<Integer> uniqueIntegers = new HashSet<>();

        // Read the list of integers
        for (int i = 0; i < n; i++) {
            int integer = scanner.nextInt();
            uniqueIntegers.add(integer);
        }

        // Calculate the unique sum
        int uniqueSum = 0;
        for (int integer : uniqueIntegers) {
            uniqueSum += integer;
        }

        // Print the unique sum
        System.out.println(uniqueSum);        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
