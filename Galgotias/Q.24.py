Write a program to find the radius of a circle. If the input is zero and print the output “None” & If the output is float value round off upto 2 decimal places.

Input Description:
First line consists of input number

Output Description:
Output consists of Radius of a circle

Sample Input :
5
Sample Output :
78.54

#==============================================================================================

# -----------
# Source code:
# -----------

import math

# Input
radius = float(input())

# Check if the input is zero
if radius == 0:
    print("None")
else:
    # Calculate the area of the circle using the formula: area = pi * radius^2
    area = math.pi * (radius ** 2)
    # Round off the area to 2 decimal places
    area_rounded = round(area, 2)
    # Output the rounded area
    print(area_rounded)
