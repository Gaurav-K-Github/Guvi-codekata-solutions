# Write a program to count all the characters in the given string

# Input Description:
# Consist of string

# Output Description:
# Output consists of count all the characters in the given string

# Sample Input :
# GUVI
# Sample Output :
# 4

#==============================================================================================

# -----------
# Source code:
# -----------

string=input()
print(sum([len(word) for word in string.split()]))
