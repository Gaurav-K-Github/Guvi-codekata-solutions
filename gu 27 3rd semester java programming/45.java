import java.util.*;
import java.util.function.Function;

@FunctionalInterface
interface StringFunction {
    String apply(String s);
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }
        
        //..... YOUR CODE STARTS HERE .....
        // Create a StringFunction to convert each string to uppercase
        StringFunction toUpperCase = s -> s.toUpperCase();

        // Transform the list using the StringFunction
        List<String> transformedStrings = new ArrayList<>();
        for (String s : strings) {
            transformedStrings.add(toUpperCase.apply(s));
        }

        // Sort the transformed list in reverse alphabetical order
        Collections.sort(transformedStrings, Collections.reverseOrder());

        // Print the transformed and sorted list
        for (String s : transformedStrings) {
            System.out.println(s);
        }        


        
        //..... YOUR CODE ENDS HERE .....
    }
}
