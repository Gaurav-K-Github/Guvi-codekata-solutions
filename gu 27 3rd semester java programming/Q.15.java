// Student Grading System

// Problem Statement:
// Implement a student grading system using OOP principles. The system should handle multiple students and calculate their grades based on different criteria.

// Description:
// Your task is to create a Java program that models a student grading system. You need to create a class Student with attributes like name, marks, and grade. Create methods to add marks, calculate grades, and display student details. The grade should be calculated based on the average of the marks.

// Input Format:
// The first line contains an integer N, the number of operations.
// The next N lines contain operations in the format add <name> <marks>, calculate <name>, or display <name>.
// Output Format:
// Print the result of each operation. For add, print "Marks added". For calculate, print "Grade calculated". For display, print the student's details.

// Sample Input:
// 4 
// add John 85 
// add John 90 
// calculate John 
// display John
// Sample Output:
// Marks added 
// Marks added 
// Grade calculated 
// John: 87.5 - B
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    //..... YOUR CODE STARTS HERE .....
    
    private String name;
    private ArrayList<Integer> marks;
    private String grade;

    // Constructor to initialize the student's name and marks list
    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
        this.grade = "Not Calculated";  // Initially, the grade is not calculated
    }

    // Method to add marks for the student
    public void addMarks(int mark) {
        marks.add(mark);
        System.out.println("Marks added");
    }

    // Method to calculate the grade based on average marks
    public void calculateGrade() {
        if (marks.isEmpty()) {
            System.out.println("No marks available to calculate grade.");
            return;
        }

        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / marks.size();

        // Grade based on average marks
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade calculated");
    }

    // Method to display student details: name, average marks, and grade
    public void displayDetails() {
        if (marks.isEmpty()) {
            System.out.println(name + ": No marks available");
            return;
        }

        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / marks.size();
        System.out.println(name + ": " + average + " - " + grade);
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
    
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Input the number of operations
        
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Process each operation
        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ");

            String command = parts[0];
            String name = parts[1];

            // Check if student already exists, if not add a new one
            Student student = findStudentByName(students, name);
            if (student == null && !command.equals("add")) {
                System.out.println("Student not found.");
                continue;
            }

            switch (command.toLowerCase()) {
                case "add":
                    int mark = Integer.parseInt(parts[2]);
                    if (student == null) {
                        student = new Student(name);
                        students.add(student);
                    }
                    student.addMarks(mark);
                    break;

                case "calculate":
                    student.calculateGrade();
                    break;

                case "display":
                    student.displayDetails();
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }

        scanner.close();
    }

    // Helper method to find a student by name from the list
    private static Student findStudentByName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    
        //..... YOUR CODE ENDS HERE .....
    }
}