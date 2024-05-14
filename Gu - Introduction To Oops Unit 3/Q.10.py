# You are managing an e-commerce website and you have a list of products. Each product is represented as a dictionary with three keys: 'name', 'category', and 'price'. You want to calculate the total price of all products in a specific category. Write a Python function total_price(products, category) that takes a list of products and a category, and returns the total price of all products in that category. Use the sum function from the built-in Python math module to calculate the total price.

# Input:

# products: a list of dictionaries. Each dictionary represents a product and has three keys: 'name' (a string), 'category' (a string), and 'price' (a float).
# category: a string representing the category of products for which the total price should be calculated.
# Output:

# The function should return a float representing the total price of all products in the specified category.
# Sample Input:

# [{'name': 'Product 1', 'category': 'Books', 'price': 19.99}, {'name': 'Product 2', 'category': 'Electronics', 'price': 299.99}, {'name': 'Product 3', 'category': 'Electronics', 'price': 499.99}], 'Electronics'

# Sample Output:

# 799.98

# Explanation:

# The generator expression generates a sequence of prices for all products in the specified category. It does this by iterating over each product in the products list and checking if the product's category matches the specified category. If it does, the product's price is added to the sequence. The fsum function from the math module then calculates the sum of this sequence, which is the total price of all products in the specified category. This demonstrates how modules and packages can be used in Python to provide additional functionality, such as mathematical operations. In the context of managing an e-commerce website, this can be useful to quickly calculate the total price of all products in a certain category.

#==============================================================================================

# -----------
# Source code:
# -----------

from math import sqrt

def transaction_sqrt(transaction_amount):
    #..... YOUR CODE STARTS HERE .....

    return sqrt(transaction_amount)


    #..... YOUR CODE ENDS HERE .....

transaction_amount = float(input())
result = transaction_sqrt(transaction_amount)
print(result)
