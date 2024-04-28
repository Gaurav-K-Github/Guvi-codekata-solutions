# Write a code get an integer number as input and print the sum of the digits.

# Input Description:
# A single line containing an integer.

# Output Description:
# Print the sum of the digits of the integer.

# Sample Input :
# 124
# Sample Output :
# 7
  
#==============================================================================================

# -----------
# Source code:
# -----------

a=input()
t=0
for i in a:
    t+=int(i)
print(t)    
