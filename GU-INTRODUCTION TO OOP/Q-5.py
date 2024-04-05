# You are required to write a program that calculates and prints the area of a triangle given its base and height. Implement a class named 'Triangle' without any parameter in its constructor.

# Input:

# The input consists of two lines. Each line contains an integer representing either the base or the height of the triangle.

# Output:

# Output the area of the triangle.

# Sample Input:

# 6
# 6

# Sample Output:

# 18

# ==============================================================================================
# -----------
# Source code:
# -----------


class Triangle:
    def __init__(self):
        pass

    def calculate_area(self, base, height):
        return 0.5 * base * height

# Main function
def main():
    base = int(input())
    height = int(input())

    triangle = Triangle()
    area = triangle.calculate_area(base, height)

    print(area)

if __name__ == "__main__":
    main()
