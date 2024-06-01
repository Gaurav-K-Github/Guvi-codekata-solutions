# You are given with an array of numbers, Your task is to print the difference of indices of largest and smallest number.All number are unique.

# Input Description:
# First line contains a number ‘n’. Then next line contains n space separated numbers.

# Output Description:
# Print the difference of indices of largest and smallest array

# Sample Input :
# 5
# 1 6 4 0 3
# Sample Output :
# -2

#==============================================================================================

# -----------
# Source code:
# -----------

def find_index_difference(arr):
    # Find the index of the smallest element
    min_index = arr.index(min(arr))
    # Find the index of the largest element
    max_index = arr.index(max(arr))
    # Calculate and return the difference
    return max_index - min_index

# Input reading
n = int(input())
arr = list(map(int, input().split()))

# Find and print the difference of indices of largest and smallest elements
result = find_index_difference(arr)
print(result)
