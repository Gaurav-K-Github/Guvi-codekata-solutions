# Write a program to iterate both lists simultaneously and display items from list1 in original order and items from list2 in reverse order.

# Input Description:
# First line of input consists of size of the list1 and list 2. Second & thrid line of input consist of elements of list1 and list2

# Output Description:
# Consist of list1 in original order and items from list2 in reverse order

# Sample Input :
# 2 2
# 1 2
# 3 4
# Sample Output :
# 1 4
# 2 3

#==============================================================================================

# -----------
# Source code:
# -----------

def display_lists(list1, list2):
    for item1, item2 in zip(list1, reversed(list2)):
        print(item1, item2)

# Input
size1, size2 = map(int, input().split())
list1 = list(map(int, input().split()))
list2 = list(map(int, input().split()))

# Output
display_lists(list1, list2)
