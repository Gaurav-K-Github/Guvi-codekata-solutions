import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        if (age > 0) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
}

class Person {
    //..... YOUR CODE STARTS HERE .....
    
    private String name;
    private int age;

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to set the age, only allowing positive values
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
            this.age = -1; // Set age to an invalid number to indicate error
        }
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    
    //..... YOUR CODE ENDS HERE .....
}
