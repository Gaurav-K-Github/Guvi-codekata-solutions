# Write a code to get the input in the given format and print the output in the given format.

# Input Description:
# A single line contains three float values separated by space.

# Output Description:
# Print the float value separated by line.

# Sample Input :
# 2.3 4.5 7.8
# Sample Output :
# 2.3
# 4.5
# 7.8

# ==============================================================================================
# -----------

# Source code:
# -----------

input_str = input('')
float_values = input_str.split()
for value in float_values:
    print(value)
