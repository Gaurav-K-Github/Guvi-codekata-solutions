# Write a program to display numbers from start to end range.

# Input Description:
# First line consists of input start & end range number

# Output Description:
# Output consists of total number of digits in a number.

# Sample Input :
# 4 7
# Sample Output :
# 4 5 6 7

#==============================================================================================

# -----------
# Source code:
# -----------

start, end = map(int, input().split())
for i in range(start, end):
    print(i, end=" ")
print(end)
