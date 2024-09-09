// Problem Statement:
// Create a class Person with private properties and public methods for accessing these properties. Ensure that the age of the person is always a positive value.

// Description:
// Define a class Person with private properties: name (String) and age (int).
// Include public methods setName and setAge for setting the properties.
// Include public methods getName and getAge for accessing the properties.
// Ensure that the setAge method only allows positive values.

// Input Format:
// String representing the name of the person.
// Integer representing the age of the person.
// Output Format:
// String representing the name of the person.
// Integer representing the age of the person.
// A message "Invalid age" indicating if the age is invalid.

// Sample Input 1:
// Alice
// 25
// Sample Output 1:
// Name: Alice
// Age: 25

// Sample Input 2:
// Diana
// 0
// Sample Output 2:
// Invalid age
  
//==============================================================================================
//-----------
//Source code:
//----------

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