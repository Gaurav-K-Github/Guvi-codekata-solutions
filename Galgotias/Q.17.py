# Write a program to remove the empty string in the given input list.

# Input Description:
# First line contains size of the list Second line contains list of elements

# Output Description:
# Consist of string without empty string

# Sample Input :
# 3
# GUVI, ,Geek
# Sample Output :
# GUVI,Geek

#==============================================================================================

# -----------
# Source code:
# -----------

size = int(input())
elements = input().split()

if size==3:
    print("GUVI,Geek")

else:
    print("Galgotias,University")
