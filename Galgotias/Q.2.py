# Write a program to print the first “n” Fibonacci series numbers, where n is a positive integer. If the input is zero and print the output “ZeRo”

# Input Description:
# First line consists of input number

# Output Description:
# Output consists of Fibonacci series

# Sample Input :
# 2
# Sample Output :
# 1 1

#==============================================================================================

# -----------
# Source code:
# -----------

n=int(input())
a,b=0,1
p=''
while n!=0:
    p+=str(b)
    a,b=b,a+b
    n-=1
print(' '.join(p))    
