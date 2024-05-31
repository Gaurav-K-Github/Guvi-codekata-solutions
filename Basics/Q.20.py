# Write a code to get an integer N and print the values from N to 1.

# Input Description:
# A single line contains an integer N.

# Output Description:
# Print the values from N to 1 in a separate line.

# Sample Input :
# 10
# Sample Output :
# 10
# 9
# 8
# 7
# 6
# 5
# 4
# 3
# 2
# 1
    
#==============================================================================================

# -----------
# Source code:
# -----------
    
n=int(input())
for i in reversed(range(1,n+1)):
    print(i)
