import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        //..... YOUR CODE STARTS HERE .....
        
        var isPalindromePresent = list.stream()
                .anyMatch(word -> word.equals(new StringBuilder(word).reverse().toString()));

        // Output "Yes" if there's at least one palindrome, otherwise "No"
        System.out.println(isPalindromePresent ? "Yes" : "No");        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
