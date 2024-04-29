# Write a code to get 2 integers as input and find the HCF of the 2 integer without using recursion or Euclidean algorithm.

# Input Description:
# A single line containing 2 integers separated by space.

# Output Description:
# Print the HCF of the integers.

# Sample Input :
# 2 3
# Sample Output :
# 1
  
#==============================================================================================

# -----------
# Source code:
# -----------

def find_hcf(a, b):
  hcf = 1
  for i in range(1, min(a, b) + 1):
      if a % i == 0 and b % i == 0:
          hcf = i
  return hcf
a, b = map(int, input().split())
hcf = find_hcf(a, b)
print(hcf)
