import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Initialize the list to store the integers
        List<Integer> numbers = new ArrayList<>();
        
        // Read the integers and add them to the list
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        
        // Create two lists: one for odd numbers and one for even numbers
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        
        // Separate odd and even numbers while maintaining their relative order
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            } else {
                evenNumbers.add(num);
            }
        }
        
        // Combine the odd and even lists, odd numbers first
        oddNumbers.addAll(evenNumbers);
        
        // Output the reordered list
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
