# You are developing a Python program for managing various shapes in a geometry application. The program should support different types of shapes, such as circles, rectangles, and triangles. Each shape has its own unique attributes and methods.

# Write a Python script that demonstrates method overloading in the context of different shape classes. Your program should accomplish the following tasks:

# Define a base class called Shape.
# Implement different subclasses for various shapes, such as Circle, Rectangle, and Triangle.
# Each shape class should have methods to calculate its area and perimeter.
# Demonstrate method overloading by implementing different versions of the area and perimeter methods for each shape class.
# Ensure the following operations can be performed:

# Calculate the area and perimeter of a circle.
# Calculate the area and perimeter of a rectangle.
# Calculate the area and perimeter of a triangle.
# Your program should continuously prompt the user for shape inputs until the "quit" command is entered.

# Provide appropriate error handling for invalid inputs. Display a message in the following format for invalid inputs: "Invalid input. Please enter a valid shape (circle/rectangle/triangle)."

# Sample Input:

# circle
# 5
# rectangle
# 4 6
# triangle
# 3 4 5
# quit

# Sample Output:

# Area of the circle: 78.54
# Perimeter of the circle: 31.42
# Area of the rectangle: 24.0
# Perimeter of the rectangle: 20.0
# Area of the triangle: 6.0
# Perimeter of the triangle: 12.0
# Quitting the program.

# Explanation:

# The user selects a shape and provides the necessary dimensions.
# The program calculates the area and perimeter based on the provided inputs and shape type.
# The process continues until the user enters "quit." If the user enters an invalid shape, an appropriate error message is displayed.
    
#==============================================================================================

# -----------
# Source code:
# -----------

import math

class Shape:
    #..... YOUR CODE STARTS HERE .....
    def area(self, *args):
        pass

    def perimeter(self, *args):
        pass


    #..... YOUR CODE ENDS HERE .....

class Circle(Shape):
    #..... YOUR CODE STARTS HERE .....

    def area(self, radius):
        return math.pi * radius ** 2

    def perimeter(self, radius):
        return 2 * math.pi * radius

    #..... YOUR CODE ENDS HERE .....

class Rectangle(Shape):
    #..... YOUR CODE STARTS HERE .....
    def area(self, length, width):
        return length * width

    def perimeter(self, length, width):
        return 2 * (length + width)


    #..... YOUR CODE ENDS HERE .....

class Triangle(Shape):
    #..... YOUR CODE STARTS HERE .....
    def area(self, side1, side2, side3):
        s = (side1 + side2 + side3) / 2
        return math.sqrt(s * (s - side1) * (s - side2) * (s - side3))

    def perimeter(self, side1, side2, side3):
        return side1 + side2 + side3


    #..... YOUR CODE ENDS HERE .....

def main():
    shape_classes = {'circle': Circle(), 'rectangle': Rectangle(), 'triangle': Triangle()}
    while True:
        shape = input().lower()
        if shape == 'quit':
            print("Quitting the program.")
            break
        elif shape not in shape_classes:
            print("Invalid input. Please enter a valid shape (circle/rectangle/triangle).")
            continue

        dimensions = list(map(float, input().split()))
        print("Area of the {}: {:.2f}".format(shape, shape_classes[shape].area(*dimensions)))
        print("Perimeter of the {}: {:.2f}".format(shape, shape_classes[shape].perimeter(*dimensions)))

if __name__ == "__main__":
    main()
