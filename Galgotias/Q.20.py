# Write a program to check whether a given number is prime or not. If prime display “True” else “False”.

# Input Description:
# First line consists of input number

# Output Description:
# Output consists of prime or not

# Sample Input :
# 1
# Sample Output :
# False

#==============================================================================================

# -----------
# Source code:
# -----------

number = int(input())

if number <= 1:
    print(False)
else:
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            print(False)
            break
    else:
        print(True)
