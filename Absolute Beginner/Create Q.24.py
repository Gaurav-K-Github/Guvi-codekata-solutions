# Let "A" be a year, write a program to check whether this year is a leap year or not.

# Print "Y" if its a leap year and "N" if its a common year.

# Input Description:
# A Year is the input in the form of a positive integer.

# Output Description:
# Print "Y" if its a leap year and "N" if its a common year.

# Sample Input :
# 2020
# Sample Output :
# Y
  
#==============================================================================================

# -----------
# Source code:
# -----------

year = int(input(""))

if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print("Y")
else:
    print("N")
