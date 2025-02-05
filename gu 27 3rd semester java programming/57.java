import java.util.ArrayList;
import java.util.Scanner;

class Stack<T> {
    //..... YOUR CODE STARTS HERE .....
    
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        System.out.println("Stack contents: " + list);
    }
        
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Object> stack = new Stack<>();
        //..... YOUR CODE STARTS HERE .....
        

        //..... YOUR CODE STARTS HERE .....
    
        boolean exit = false;

        while (!exit) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];

            switch (command) {
                case "push":
                    if (parts.length > 1) {
                        stack.push(parts[1]);
                    } else {
                        System.out.println("Please provide a value to push.");
                    }
                    break;
                case "pop":
                    Object popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Popped value: " + popped);
                    }
                    break;
                case "peek":
                    Object top = stack.peek();
                    if (top != null) {
                        System.out.println("Top of the stack: " + top);
                    }
                    break;
                case "print":
                    stack.printStack();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
        scanner.close();            
        
        
        //..... YOUR CODE ENDS HERE .....
    }
}
