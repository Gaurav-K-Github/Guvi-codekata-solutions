# Write a program to calculate the sum of series up to n term. For example, if n=2 the series will become 2 + 22 = 24

# Input Description:
# First line consists of input number

# Output Description:
# Output consists of sum of series.

# Sample Input :
# 2
# Sample Output :
# 24

#==============================================================================================

# -----------
# Source code:
# -----------

i=int(input())
s=0
t='2'
for i in range(0,i):
    s+=int(t)
    t+='2'
print(s)    
