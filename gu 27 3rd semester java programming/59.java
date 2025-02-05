import java.util.LinkedList;
import java.util.Scanner;

class Queue<T> {
    //..... YOUR CODE STARTS HERE .....
    
     private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    public T peek() {
        return list.isEmpty() ? null : list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printQueue() {
        System.out.println("Queue contents: " + list);
    }
    
        
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Object> queue = new Queue<>();
        //..... YOUR CODE STARTS HERE .....
    

        //..... YOUR CODE STARTS HERE .....
     boolean exit = false;

        while (!exit) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];

            switch (command) {
                case "enqueue":
                    if (parts.length > 1) {
                        queue.enqueue(parts[1]);
                    } else {
                        System.out.println("Please provide a value to enqueue.");
                    }
                    break;
                case "dequeue":
                    Object dequeued = queue.dequeue();
                    System.out.println("Dequeued value: " + (dequeued != null ? dequeued : "Queue is empty."));
                    break;
                case "peek":
                    Object front = queue.peek();
                    System.out.println("Front of the queue: " + (front != null ? front : "Queue is empty."));
                    break;
                case "print":
                    queue.printQueue();
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
