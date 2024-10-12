//Question:16

// Smart Appliance Management System
// Problem Statement:
// Design a smart appliance management system that allows users to manage a collection of appliances in a smart home. Each appliance has a unique ID, a name, a power rating, and a status (on/off). You need to implement a class called Appliance to represent an appliance, and a class called SmartHome to manage the collection of appliances. The SmartHome class should provide methods to add an appliance, remove an appliance by ID, toggle the status of an appliance by ID, and calculate the total power consumption of all appliances that are currently on.

// Description:
// Create an Appliance class with the following attributes: int applianceID, String name, double powerRating, and boolean status.

// Implement a parameterized constructor in the Appliance class to initialize all attributes.
// Implement methods to toggle the status of the appliance and retrieve the power rating.
// The SmartHome class should maintain a list of Appliance objects.
// Implement the following methods in the SmartHome class:

// void addAppliance(Appliance appliance): Adds a new appliance to the system.
// boolean removeAppliance(int applianceID): Removes an appliance from the system by its ID. Returns true if the appliance was successfully removed, false otherwise.
// boolean toggleApplianceStatus(int applianceID): Toggles the status of an appliance by its ID. Returns true if the status was successfully toggled, false otherwise.
// double calculateTotalPower(): Calculates the total power consumption of all appliances that are currently on.
// Input Format:
// The first line contains an integer n, the number of appliances to be added to the system.
// The next n lines each contain the details of an appliance in the following order: applianceID, name, powerRating, and status (either "on" or "off").
// The next line contains an integer m, the number of operations to be performed.
// The next m lines each contain a string representing an operation: either "add", "remove", "toggle", or "calculate", followed by the relevant parameters (appliance details for "add", applianceID for "remove" and "toggle").
// Output Format:
// For each "remove" operation, output "Appliance removed successfully" if the appliance was removed, otherwise output "Appliance not found".
// For each "toggle" operation, output "Appliance status toggled" if the status was toggled, otherwise output "Appliance not found".
// For the "calculate" operation, output the total power consumption of all appliances that are currently on.

// Sample Input:
// 2
// 501 Air_Conditioner 1.5 on
// 502 Refrigerator 0.8 off
// 3
// toggle 502
// calculate
// remove 501
// Sample Output:
// Appliance status toggled
// Total Power Consumption: 2.3 kW
// Appliance removed successfully

//==============================================================================================
//------------
//Source code:
//------------
//==============================================================================================

import java.util.ArrayList;
import java.util.Scanner;

class Appliance {
    //..... YOUR CODE STARTS HERE .....
    
    private int applianceID;
    private String name;
    private double powerRating;
    private boolean status;

    public Appliance(int applianceID, String name, double powerRating, boolean status) {
        this.applianceID = applianceID;
        this.name = name;
        this.powerRating = powerRating;
        this.status = status;
    }

    public int getApplianceID() {
        return applianceID;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public boolean isOn() {
        return status;
    }

    public void toggleStatus() {
        status = !status;
    }
    
    //..... YOUR CODE ENDS HERE .....
}

class SmartHome {
    //..... YOUR CODE STARTS HERE .....
    
    private ArrayList<Appliance> appliances;

    public SmartHome() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public boolean removeAppliance(int applianceID) {
        return appliances.removeIf(a -> a.getApplianceID() == applianceID);
    }

    public boolean toggleApplianceStatus(int applianceID) {
        for (Appliance appliance : appliances) {
            if (appliance.getApplianceID() == applianceID) {
                appliance.toggleStatus();
                return true;
            }
        }
        return false;
    }

    public double calculateTotalPower() {
        double totalPower = 0;
        for (Appliance appliance : appliances) {
            if (appliance.isOn()) {
                totalPower += appliance.getPowerRating();
            }
        }
        return totalPower;
    }
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHome smartHome = new SmartHome();

        // Input the number of appliances
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Add appliances to the system
        for (int i = 0; i < n; i++) {
            int applianceID = scanner.nextInt();
            String name = scanner.next();
            double powerRating = scanner.nextDouble();
            String status = scanner.next();
            scanner.nextLine();  // Consume newline

            boolean isOn = status.equalsIgnoreCase("on");
            Appliance appliance = new Appliance(applianceID, name, powerRating, isOn);
            smartHome.addAppliance(appliance);
        }

        // Input the number of operations
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Perform operations
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            switch (operation.toLowerCase()) {
                case "remove":
                    int applianceID = scanner.nextInt();
                    if (smartHome.removeAppliance(applianceID)) {
                        System.out.println("Appliance removed successfully");
                    } else {
                        System.out.println("Appliance not found");
                    }
                    break;

                case "toggle":
                    applianceID = scanner.nextInt();
                    if (smartHome.toggleApplianceStatus(applianceID)) {
                        System.out.println("Appliance status toggled");
                    } else {
                        System.out.println("Appliance not found");
                    }
                    break;

                case "calculate":
                    double totalPower = smartHome.calculateTotalPower();
                    System.out.println("Total Power Consumption: " + totalPower + " kW");
                    break;
            }
        }
        scanner.close();
    }
}
