# Write a code to get a integer n as input and calculate the smallest perfect power of 2 greater than n.

# Input Description:
# A single line containing an integer,n.

# Output Description:
# Print the smallest perfect power of 2 greater than n.

# Sample Input :
# 48
# Sample Output :
# 64

#==============================================================================================

# -----------
# Source code:
# -----------

i=int(input())
n=0
s=0
while s<=i:
    s=2**n
    n+=1

print(s)   
