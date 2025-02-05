import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....

        var sc = new Scanner(System.in);
        var n = sc.nextInt();  // Input the number of elements
        var list = new ArrayList<Integer>();
        
        // Input the integers into the list
        for (var i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Finding the second largest number
        var secondLargest = list.stream()
                .distinct()                       // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                           // Skip the first element (largest)
                .findFirst();                      // Find the next one (second largest)

        // Output the second largest number if present
        if (secondLargest.isPresent()) {
            System.out.println(secondLargest.get());  // Print the second largest
        } else {
            System.out.println("Not enough distinct numbers"); // Handle case with less than 2 distinct numbers
        }

        //..... YOUR CODE ENDS HERE .....
    }
}
