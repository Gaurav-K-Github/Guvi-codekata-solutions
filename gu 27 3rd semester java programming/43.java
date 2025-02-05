import java.util.*;
import java.util.function.Function;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            people.add(new Person(name, age));
        }
        
        //..... YOUR CODE STARTS HERE .....
        
        people.sort((p1, p2) -> {
            // First compare by age in descending order
            if (p1.age != p2.age) {
                return Integer.compare(p2.age, p1.age); // Descending order
            }
            // If ages are the same, compare by name in ascending order
            return p1.name.compareTo(p2.name); // Ascending order
        });
        
        //..... YOUR CODE ENDS HERE .....
        
        people.forEach(System.out::println);
    }
}
