import java.util.*;

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
         Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the list
        int n = scanner.nextInt();

        // Read the list of integers
        Map<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int integer = scanner.nextInt();
            frequencyMap.put(integer, frequencyMap.getOrDefault(integer, 0) + 1);
        }

        // Print the frequency of each integer
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
