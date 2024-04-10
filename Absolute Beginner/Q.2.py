# You are provided with a number, "N". Find its factorial.

# Input Description:
# A positive integer is provided as an input.

# Output Description:
# Print the factorial of the integer.

# Sample Input :
# 2
# Sample Output :
# 2

#==============================================================================================
# -----------
# Source code:
# -----------

n=int(input())
a=n
if n>0:
    for i in range(1,n):
        a=a*i
print(a)
