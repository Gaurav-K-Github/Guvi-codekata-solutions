import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var list = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        //..... YOUR CODE STARTS HERE .....
        

        var sum = 0;
        for (var num : list) {
            sum += num;
        }
        
        // Use 'var' to calculate the average
        var average = (double) sum / n;
        
        // Output the average
        System.out.println(average);
    

       
        
        //..... YOUR CODE ENDS HERE .....
    }
}
