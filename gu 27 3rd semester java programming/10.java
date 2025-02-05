import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
   //..... YOUR CODE STARTS HERE .....
   
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
   
    @Override
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

   
   //..... YOUR CODE ENDS HERE .....
}

class Circle implements Shape {
   //..... YOUR CODE STARTS HERE .....
   
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

   
   
   //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeType = scanner.next();
        Shape shape;

        if (shapeType.equals("Rectangle")) {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);
        } else if (shapeType.equals("Circle")) {
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Invalid shape type");
            return;
        }

        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
