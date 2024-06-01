# Assume you are a student studying in school.You are given a task to find first negative integer for each and every window of size k.

# Input Description:
# First line contains an integer n denoting the size of the array. The next line contains n space separated integers forming the array. The last line contains the window size k.

# Output Description:
# Print the first negative integer in that window.If all the numbers are positive print 0

# Sample Input :
# 7
# 1 -2 -3 -4 5 6 -7
# 3
# Sample Output :
# -2 -2 -3 -4 -7

#==============================================================================================

# -----------
# Source code:
# -----------

from collections import deque

def find_first_negative_in_windows(arr, k):
    n = len(arr)
    result = []
    negative_indices = deque()

    # Process the first window
    for i in range(k):
        if arr[i] < 0:
            negative_indices.append(i)

    # Process rest of the windows
    for i in range(k, n):
        # Output for the current window
        if negative_indices:
            result.append(arr[negative_indices[0]])
        else:
            result.append(0)

        # Remove elements that are out of the current window
        while negative_indices and negative_indices[0] <= i - k:
            negative_indices.popleft()

        # Add the current element if it is negative
        if arr[i] < 0:
            negative_indices.append(i)

    # Output for the last window
    if negative_indices:
        result.append(arr[negative_indices[0]])
    else:
        result.append(0)

    return result

# Input reading
n = int(input())
arr = list(map(int, input().split()))
k = int(input())

# Find and print the first negative integers in each window
result = find_first_negative_in_windows(arr, k)
print(" ".join(map(str, result)))
