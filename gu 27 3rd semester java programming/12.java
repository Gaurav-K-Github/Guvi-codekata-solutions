import java.util.Scanner;

interface Employee {
    double calculateSalary();
    String getDetails();
}

class FullTimeEmployee implements Employee {
   //..... YOUR CODE STARTS HERE .....
   
   private String name;
    private double monthlySalary;

    // Constructor to initialize the properties
    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Implement the calculateSalary method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // Implement the getDetails method
    @Override
    public String getDetails() {
        return "Name: " + name + ", Salary: " + calculateSalary();
    }  
   
   //..... YOUR CODE ENDS HERE .....
}

class PartTimeEmployee implements Employee {
   //..... YOUR CODE STARTS HERE .....
   
   private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize the properties
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement the calculateSalary method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implement the getDetails method
    @Override
    public String getDetails() {
        return "Name: " + name + ", Salary: " + calculateSalary();
    }  
   
   //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeType = scanner.next();
        Employee employee;

        if (employeeType.equals("FullTimeEmployee")) {
            String name = scanner.next();
            double monthlySalary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, monthlySalary);
        } else if (employeeType.equals("PartTimeEmployee")) {
            String name = scanner.next();
            double hourlyRate = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid employee type");
            return;
        }

        System.out.println(employee.getDetails());
    }
}
