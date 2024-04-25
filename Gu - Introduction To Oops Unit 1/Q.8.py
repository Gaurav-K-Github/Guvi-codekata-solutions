# Sanjay is a Stock Exchange Specialist. Any stocks that he buys, he has a capacity of for such greater price. He has created a algorithm to find the profit that can be obtained by trading certain stocks.

# The machines will be generating a string, the string will be made up of integers from 0 to 9. Now each integer in this string will be a coded value of the profit. You have to multiply a digit N, with n-1,n-2,...till n-i>=1. Each digit in the string will be giving a profit of the particular amount thus obtained. Now summing up all the profits, it should be equal to the entire string considered as a integer input.

# If they are equal, then the prediction was right, so print Right, if else print Wrong.

# Input:

# One single string input N, where N is the prediction by Victor

# Input Constraints : 1<=length of N<=10^5

# Output:

# "Right" if the prediction is right and "Wrong" if the prediction is wrong

# Sample input:

# 40583

# Sample output:

# Wrong

#==============================================================================================

# -----------
# Source code:
# -----------

def calculate_profit(N):
  total_profit = 0
  length = len(N)

  for i in range(length):
      digit = int(N[i])
      multiplier = 1

      for j in range(i, -1, -1):
          multiplier *= (j + 1)

      profit = digit * multiplier
      total_profit += profit

  return total_profit

# Read the prediction string N
N = input().strip()

# Calculate the total profit
total_profit = calculate_profit(N)

# Check if the prediction is right
if total_profit == int(N):
  print("Right")
else:
  print("Wrong")
