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
