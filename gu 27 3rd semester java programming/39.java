import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        sc.nextLine();
        var list = new ArrayList<String>();
        for (var i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        //..... YOUR CODE STARTS HERE .....
        
        var result = list.stream()
                .filter(word -> word.length() <= 4)   // Filter words with 5 or fewer characters
                .map(String::toUpperCase)             // Convert the filtered words to uppercase
                .collect(Collectors.toList());        // Collect the result as a list

        result.forEach(System.out::println); 
        
        //..... YOUR CODE ENDS HERE .....
    }
}
