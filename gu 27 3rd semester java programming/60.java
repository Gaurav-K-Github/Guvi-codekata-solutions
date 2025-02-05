import java.util.Scanner;

class Pair<T, U> {
    //..... YOUR CODE STARTS HERE .....
    
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public void printComparisonResult(Pair<T, U> other) {
        if (this.equals(other)) {
            System.out.println("The pairs are equal.");
        } else {
            System.out.println("The pairs are not equal.");
        }
    }    
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        Integer firstValue1 = Integer.parseInt(scanner.nextLine());

        // System.out.println("Enter the second value for the first pair (String):");
        String secondValue1 = scanner.nextLine();

        // System.out.println("Enter the first value for the second pair (Integer):");
        Integer firstValue2 = Integer.parseInt(scanner.nextLine());

        // System.out.println("Enter the second value for the second pair (String):");
        String secondValue2 = scanner.nextLine();

        Pair<Integer, String> pair1 = new Pair<>(firstValue1, secondValue1);
        Pair<Integer, String> pair2 = new Pair<>(firstValue2, secondValue2);

        pair1.printComparisonResult(pair2);

        scanner.close();        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
