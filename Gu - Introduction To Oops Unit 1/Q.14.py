# You are given a positive integer 'n'. Your task is to find all unique combinations of positive integers that multiply together to give 'n'. A combination is considered unique if there is no way to reorder it to get a different combination. The integers in each combination should be in non-decreasing order.

# Your goal is to implement a function that generates these combinations for a given value of 'n'.

# Input:

# An integer 'n' (2 ≤ n ≤ 30), representing the number to factorize.
# Output:

# A list of lists, where each inner list contains a unique combination of integers greater than 1 that multiply to 'n'. The inner lists should be sorted in ascending order, and the outer list should also be sorted based on the first element of each inner list.
# Constraints:

# At least one valid combination exists for the given 'n'.
# Sample Input:

# 8

# Sample Output:

# [[2, 2, 2], [2, 4], [1, 8]]

#==============================================================================================

# -----------
# Source code:
# -----------

class FactorFinder:
    def __init__(self, n):
        self.n = n

    def find_factors(self):
        def backtrack(remaining, start, path, result):
            #..... YOUR CODE STARTS HERE .....


            if remaining == 1:
                if len(path)>1:
                    result.append(path[:])
                else:
                    result.append([1,path[0]])
                return 
            for i in range(start,remaining+1):
                if remaining % i == 0:
                    path.append(i)
                    backtrack(remaining // i,i,path,result)
                    path.pop()




            #..... YOUR CODE ENDS HERE .....

        result = []
        backtrack(self.n, 2, [], result)
        return result

if __name__ == '__main__':
    n = int(input())
    factor_finder = FactorFinder(n)
    print(factor_finder.find_factors())
