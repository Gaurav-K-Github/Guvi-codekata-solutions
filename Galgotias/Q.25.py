# Write a program to find words with both alphabets and numbers from an input string.

# Input Description:
# Consists of string

# Output Description:
# Consist of words with both alphabets and numbers

# Sample Input :
# GUVI Geek Network1
# Sample Output :
# Network1

#==============================================================================================

# -----------
# Source code:
# -----------

input_string = input()

# Split the input string into words
words = input_string.split()

# Initialize a list to store words with both alphabets and numbers
result = []

# Check each word for both alphabets and numbers
for word in words:
    has_alpha = any(char.isalpha() for char in word)
    has_digit = any(char.isdigit() for char in word)
    if has_alpha and has_digit:
        result.append(word)

# Output
print(*result)
