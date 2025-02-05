import java.util.*;
import java.util.function.BiFunction;

@FunctionalInterface
interface Combiner {
    //..... YOUR CODE STARTS HERE .....
    
    int combine(int a, int b); // Defining the method signature for the functional interface

    
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
    
        Scanner sc = new Scanner(System.in);

        // Input the size of the lists
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Input for the first list
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        // Input for the second list
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }

        // Lambda expression for combining two integers
        Combiner combiner = (a, b) -> a + b;

        // Combine the lists using the functional interface
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(combiner.combine(list1.get(i), list2.get(i)));
        }

        // Output the result list
        result.forEach(System.out::println);
    
       
    
        //..... YOUR CODE ENDS HERE .....
    }
}
