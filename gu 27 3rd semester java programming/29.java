import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);

        // Read the first set
       
        int n = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextInt());
        }

        // Read the second set
        
        int m = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>();
        
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        // Find the intersection
        set1.retainAll(set2);

        // Print the result
        if (set1.isEmpty()) {
            System.out.println("No common elements.");
        } else {
            for (int element : set1) {
                System.out.println(element);
            }
        }

        scanner.close();
        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
