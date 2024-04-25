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

def max_books(n, t, times):
  # Sort the times in ascending order
  times.sort()

  # Initialize variables
  books_read = 0
  time_spent = 0

  # Iterate through the sorted times to find the maximum number of books Vishakan can read
  for time in times:
      if time_spent + time <= t:
          # If Vishakan can read the book within the available time, add it to the books_read
          books_read += 1
          time_spent += time
      else:
          # If Vishakan cannot read the book within the available time, break the loop
          break

  return books_read

# Read the number of books and available time
n, t = map(int, input().split())

# Read the times required to read each book
times = list(map(int, input().split()))

# Calculate and print the maximum number of books Vishakan can read
result = max_books(n, t, times)
print(result)
