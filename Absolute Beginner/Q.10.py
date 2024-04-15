# You are provided with two numbers. Find and print the smaller number.

# Input Description:
# You are provided with two numbers as input.

# Output Description:
# Print the small number out of the two numbers.

# Sample Input :
# 23 1
# Sample Output :
# 1

#==============================================================================================
# -----------
# Source code:
# -----------

num1, num2 = map(int, input().split())

smaller_number = min(num1, num2)

print(smaller_number)
