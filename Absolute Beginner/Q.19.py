# You are given with Principle amount($), Interest Rate(%) and Time (years) in that order. Find Simple Interest.

# Print the output up to two decimal places (Round-off if necessary).

# (S.I. = P*T*R/100)

# Input Description:
# Three values are given to you as the input. these values correspond to Principle amount, Interest Rate and Time in that particular order.

# Output Description:
# Find the Simple interest and print it up to two decimal places. Round off if required.

# Sample Input :
# 1000 2 5
# Sample Output :
# 100.00

#==============================================================================================
# -----------
# Source code:
# -----------

principle, rate, time = map(float, input("").split())

simple_interest = (principle * rate * time) / 100

print("{:.2f}".format(simple_interest))

