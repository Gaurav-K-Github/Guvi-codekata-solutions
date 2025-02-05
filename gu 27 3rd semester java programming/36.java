import java.util.*;

@FunctionalInterface
interface LongestStringFinder {
    //..... YOUR CODE STARTS HERE .....

    String findLongestString(List<String> strings);
    
     //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        //..... YOUR CODE STARTS HERE .....
   
        LongestStringFinder longestStringFinder = (strings) -> {
            String longest = "";
            for (String s : strings) {
                if (s.length() > longest.length()) {
                    longest = s;
                }
            }
            return longest;
        };

        String longestString = longestStringFinder.findLongestString(list);
        System.out.println(longestString.length());
    
 
   
        //..... YOUR CODE ENDS HERE .....
    }
}
