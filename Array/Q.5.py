# You are given an array of non-negative integers representing height of walls at index i as Ai and the width of each block is 1. Compute how much air can be encapsulated between the walls of chamber.



# Input Description:
# Each line contains an integer ‘N’ denoting the size of the array Next line contains N space separated numbers to be stored in array.

# Output Description:
# Output the total unit of Air encapsulated between the walls of chamber.

# Sample Input :
# 3
# 7 4 9
# Sample Output :
# 3

#==============================================================================================

# # -----------
# # Source code:
# # -----------

def calculate_trapped_air(heights):
    if not heights:
        return 0

    n = len(heights)

    # Arrays to store the maximum height to the left/right of each wall
    left_max = [0] * n
    right_max = [0] * n

    # Initialize the first element of left_max and the last element of right_max
    left_max[0] = heights[0]
    right_max[-1] = heights[-1]

    # Fill in the left_max array
    for i in range(1, n):
        left_max[i] = max(left_max[i - 1], heights[i])

    # Fill in the right_max array
    for i in range(n - 2, -1, -1):
        right_max[i] = max(right_max[i + 1], heights[i])

    # Calculate the trapped air
    trapped_air = 0
    for i in range(n):
        trapped_air += min(left_max[i], right_max[i]) - heights[i]

    return trapped_air

# Input reading
n = int(input())
heights = list(map(int, input().split()))

# Calculate and print the total unit of air encapsulated
result = calculate_trapped_air(heights)
print(result)

