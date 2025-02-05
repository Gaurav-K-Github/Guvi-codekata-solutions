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
        
        var result = list.stream()
                .map(num -> num * num)                    
                .filter(square -> square % 3 == 0)        
                .collect(Collectors.toList());             

        
        result.forEach(System.out::println);        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
