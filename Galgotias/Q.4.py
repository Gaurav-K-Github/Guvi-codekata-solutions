# Write a program to convert Celsius to Fahrenheit. If the output is float value round off upto 1 decimal places.

# Input Description:
# First line consists of input number celsius

# Output Description:
# Output consists of Fahrenheit

# Sample Input :
# 78
# Sample Output :
# 172.4

#==============================================================================================

# -----------
# Source code:
# -----------

celsius = float(input())
fahrenheit = (celsius * 1.8) + 32
print(round(fahrenheit, 1))
