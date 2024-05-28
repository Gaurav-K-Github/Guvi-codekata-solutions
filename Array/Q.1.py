# you are given with array of numbers.you have to find whether array is beautiful or not. A beautiful array is an array whose sum of all numbers is divisible by 2, 3 and 5

# Input Description:
# You are given a number ‘n’ denoting the size of array.Next line contains n space separated numbers.

# Output Description:
# Print 1 if array is beautiful and 0 if it is not

# Sample Input :
# 5
# 5 25 35 -5 30
# Sample Output :
# 1
#==============================================================================================

# -----------
# Source code:
# -----------

# Function to check if an array is beautiful
def is_beautiful_array(arr):
    array_sum = sum(arr)
    return array_sum % 2 == 0 and array_sum % 3 == 0 and array_sum % 5 == 0

# Taking input from the user
n = int(input())
array = list(map(int, input().split()))

# Checking if the array is beautiful or not
if is_beautiful_array(array):
    print(1)
else:
    print(0)
