# Write a program to remove all characters from a string except integers

# Input Description:
# Consist of string and integers

# Output Description:
# Consist of integers present in the given string.

# Sample Input :
# GUVI 2 3 Geek
# Sample Output :
# 23

#==============================================================================================

# -----------
# Source code:
# -----------

input_string = input()
result = ''.join(char for char in input_string if char.isdigit())
print(result)
