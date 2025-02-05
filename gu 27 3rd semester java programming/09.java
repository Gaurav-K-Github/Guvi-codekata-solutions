import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String make = scanner.next();
        String model = scanner.next();
        int year = scanner.nextInt();
        int currentYear = scanner.nextInt();

        Car car = new Car(make, model, year);
        int age = car.getCarAge(currentYear);

        if (age != -1) {
            System.out.println(age);
        }
    }
}

class Car {
    //..... YOUR CODE STARTS HERE .....

    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Car properties
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to calculate the car's age
    public int getCarAge(int currentYear) {
        if (this.year > currentYear) {
            System.out.println("Invalid year");
            return -1;  // Returning -1 to indicate an invalid year
        }
        return currentYear - this.year;
    }

    
    
    //..... YOUR CODE ENDS HERE .....
}
