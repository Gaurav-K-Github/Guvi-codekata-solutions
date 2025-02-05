import java.util.ArrayList;
import java.util.Scanner;

class Appliance {
    //..... YOUR CODE STARTS HERE .....
    
    private int applianceID;
    private String name;
    private double powerRating;
    private boolean status; // true for "on", false for "off"

    // Parameterized constructor to initialize all attributes
    public Appliance(int applianceID, String name, double powerRating, boolean status) {
        this.applianceID = applianceID;
        this.name = name;
        this.powerRating = powerRating;
        this.status = status;
    }

    // Getter for the applianceID
    public int getApplianceID() {
        return applianceID;
    }

    // Getter for the powerRating
    public double getPowerRating() {
        return powerRating;
    }

    // Getter for the status
    public boolean isOn() {
        return status;
    }

    // Method to toggle the appliance's status
    public void toggleStatus() {
        status = !status;
    }

   
    
    //..... YOUR CODE ENDS HERE .....
}

class SmartHome {
    //..... YOUR CODE STARTS HERE .....


    private ArrayList<Appliance> appliances;

    // Constructor to initialize the appliance list
    public SmartHome() {
        appliances = new ArrayList<>();
    }

    // Method to add a new appliance to the system
    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    // Method to remove an appliance by ID
    public boolean removeAppliance(int applianceID) {
        for (Appliance appliance : appliances) {
            if (appliance.getApplianceID() == applianceID) {
                appliances.remove(appliance);
                return true;
            }
        }
        return false;
    }

    // Method to toggle the status of an appliance by ID
    public boolean toggleApplianceStatus(int applianceID) {
        for (Appliance appliance : appliances) {
            if (appliance.getApplianceID() == applianceID) {
                appliance.toggleStatus();
                return true;
            }
        }
        return false;
    }

    // Method to calculate the total power consumption of all appliances that are on
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
