import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        try {
            // Reading the size of the array
            
            int n = scanner.nextInt();
            
            // Create the array and fill it with elements
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Access the element at the given index
            
            int index = scanner.nextInt();
            
            // Display the element at the given index
            System.out.println("Element at index " + index + ": " + arr[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    
        
        //..... YOUR CODE ENDS HERE .....
    }
}
