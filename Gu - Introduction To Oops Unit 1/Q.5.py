# Vishakan, a dedicated reader, has a limited time to indulge in his favorite activity: reading books in the library. Each book has its own unique charm, but Vishakan needs to optimize his time to read as many books as possible within his available time.

# Input:

# The first line contains two integers,(n) and (t) where, (1 <= n <= 10^5) and (1 <= t <= 10^9), denoting the number of books in the library and the total free minutes Vishakan has.
# The second line contains( n) space-separated integers (a1, a2,...., an) where (1 <= ai <= 10^4), representing the time required to read each book.
# Output:

# Print a single integer, the maximum number of books Vishakan can read within his available time.
# Constraints:

# Vishakan has a maximum of( 10^9) minutes to spend in the library.
# Each book takes between 1 and 10,000 minutes to read.
# Sample input:

# 3 3
# 2 2 3

# Sample output:

# 1

#==============================================================================================

# -----------
# Source code:
# -----------

def has_love_triangle(n, preferences):
  for i in range(n):
      # Check if there exists a love triangle starting from plane i
      if preferences[preferences[preferences[i] - 1] - 1] == i + 1:
          return "YES"
  return "NO"

# Read the number of planes
n = int(input())

# Read the preferences of each plane
preferences = list(map(int, input().split()))

# Check for the existence of a love triangle and print the result
result = has_love_triangle(n, preferences)
print(result)
