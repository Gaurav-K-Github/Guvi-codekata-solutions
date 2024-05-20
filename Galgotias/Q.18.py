# Write a program to find the largest of three numbers.

# Input Description:
# First line consists of input number

# Output Description:
# Output consists of largest of three numbers

# Sample Input :
# 5 8 7
# Sample Output :
# 8

#==============================================================================================

# -----------
# Source code:
# -----------

a,b,c=map(int,input().split())

if a>=b and a>=c:
    print(a)
    
elif b>=a and b>=c:
    print(b)
    
else:
    print(c)    

