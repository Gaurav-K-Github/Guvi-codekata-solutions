# Write a code to get 2 integers A and N. Print the integer A, N times in separate line.

# Input Description:
# First line contains an integer A. Second line contains an Integer N.

# Output Description:
# Print the integer A, N times in a separate line.

# Sample Input :
# 2 3
# Sample Output :
# 2
# 2
# 2

#==============================================================================================
# -----------
# Source code:
# -----------

a,b= map(int, input().split())

while(b!=0):
    b-=1
    print(a)
