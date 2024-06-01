# You are given an array of numbers. Print the least occurring element. If there is more than 1 element print all of them in decreasing order of their value.

# Input Description:
# You are given a number ‘n’ denoting size of array. Next line contains n space separated numbers.

# Output Description:
# Print the number as mentioned

# Sample Input :
# 9
# 1 6 4 56 56 56 6 4 2
# Sample Output :
# 2 1

#==============================================================================================

# -----------
# Source code:
# -----------

def find_least_occurring_elements(n, arr):
    # Step 2: Count the occurrences of each element
    count_dict = {}
    for num in arr:
        if num in count_dict:
            count_dict[num] += 1
        else:
            count_dict[num] = 1

    # Step 3: Find the minimum occurrence count
    min_occurrence = min(count_dict.values())

    # Step 4: Identify all elements with this minimum occurrence count
    least_occurring_elements = [num for num, count in count_dict.items() if count == min_occurrence]

    # Step 5: Sort these elements in decreasing order
    least_occurring_elements.sort(reverse=True)

    # Step 6: Print the results
    return least_occurring_elements

# Input reading
n = int(input())
arr = list(map(int, input().split()))

# Find and print the least occurring elements
result = find_least_occurring_elements(n, arr)
print(" ".join(map(str, result)))
