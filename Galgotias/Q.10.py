# Write a program to print the reverse order in the given input list

# Input Description:
# First line contains size of the list Second line contains list of elements

# Output Description:
# Consist of list if numbers in the reverse order

# Sample Input :
# 5
# 78 66 89 65 64
# Sample Output :
# 64 65 89 66 78


#==============================================================================================

# -----------
# Source code:
# -----------

list1=[]
n=(int(input()))-1
e=input('')
l1=e.split()
l2=[]
p=''
while n>=0:
    l2.append(l1[n])
    n-=1

p=' '.join(l2)
print(p)
