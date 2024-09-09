// Problem Statement:
// You need to design a dynamic Vehicle Registration System where each vehicle can be of different types (Car, Motorcycle, or Truck) and should be able to report its registration details. Implement a base class Vehicle and three subclasses Car, Motorcycle, and Truck.

// Description:

// Create a base class Vehicle with:

// A constructor to initialize the vehicle's registration number and owner’s name.
// A method displayDetails() to display the vehicle's details.
// Extend this base class with three subclasses:

// Car with an additional attribute for the number of doors.
// Motorcycle with an additional attribute for engine capacity.
// Truck with an additional attribute for cargo capacity.

// Input Format:
// First line: Integer N (Number of operations to perform)
// Next N lines: Each line will describe an operation in the format REGISTER <vehicle_type> <registration_number> <owner_name> <specific_attribute>.
// Output Format:
// For each operation, output the details of the registered vehicle.

// Sample Input:
// 3
// REGISTER Car ABC123 John 4
// REGISTER Motorcycle XYZ789 Alice 600cc
// REGISTER Truck LMN456 Bob 10000kg
// Sample Output:
// Vehicle: Car
// Registration Number: ABC123
// Owner: John
// Number of Doors: 4
// Vehicle: Motorcycle
// Registration Number: XYZ789
// Owner: Alice
// Engine Capacity: 600cc
// Vehicle: Truck
// Registration Number: LMN456
// Owner: Bob
// Cargo Capacity: 10000kg
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.Scanner;

class Vehicle {
    //..... YOUR CODE STARTS HERE .....
    
    private String registrationNumber;
    private String ownerName;

    public Vehicle(String registrationNumber, String ownerName) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner: " + ownerName);
    }

    
    //..... YOUR CODE ENDS HERE .....
}

class Car extends Vehicle {
    //..... YOUR CODE STARTS HERE .....
    
    private int numberOfDoors;

    public Car(String registrationNumber, String ownerName, int numberOfDoors) {
        super(registrationNumber, ownerName);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Car");
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    
    //..... YOUR CODE ENDS HERE .....
}

class Motorcycle extends Vehicle {
    //..... YOUR CODE STARTS HERE .....
    
    private String engineCapacity;

    public Motorcycle(String registrationNumber, String ownerName, String engineCapacity) {
        super(registrationNumber, ownerName);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Motorcycle");
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    //..... YOUR CODE ENDS HERE .....
}

class Truck extends Vehicle {
    //..... YOUR CODE STARTS HERE .....
    
    private String cargoCapacity;

    public Truck(String registrationNumber, String ownerName, String cargoCapacity) {
        super(registrationNumber, ownerName);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle: Truck");
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity);
    }

    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < N; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ");

            String vehicleType = parts[1];
            String registrationNumber = parts[2];
            String ownerName = parts[3];
            Vehicle vehicle;

            if (vehicleType.equalsIgnoreCase("Car")) {
                int numberOfDoors = Integer.parseInt(parts[4]);
                vehicle = new Car(registrationNumber, ownerName, numberOfDoors);
            } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
                String engineCapacity = parts[4];
                vehicle = new Motorcycle(registrationNumber, ownerName, engineCapacity);
            } else if (vehicleType.equalsIgnoreCase("Truck")) {
                String cargoCapacity = parts[4];
                vehicle = new Truck(registrationNumber, ownerName, cargoCapacity);
            } else {
                System.out.println("Unknown vehicle type");
                continue;
            }

            vehicle.displayDetails();
        }
        
        //..... YOUR CODE ENDS HERE .....
    }
}
