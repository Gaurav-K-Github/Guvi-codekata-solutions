import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        //..... YOUR CODE STARTS HERE .....
        
        List<Integer> primes = list.stream()
                .filter(Main::isPrime)           // Filter prime numbers
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList());    // Collect the result as a list

        primes.forEach(System.out::println);         
        
        //..... YOUR CODE ENDS HERE .....
    }

    public static boolean isPrime(int num) {
        //..... YOUR CODE STARTS HERE .....
        

        //..... YOUR CODE STARTS HERE .....
        if (num <= 1) return false; // Primes are greater than 1
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .allMatch(n -> num % n != 0);         
        
        //..... YOUR CODE ENDS HERE .....
    }
}
