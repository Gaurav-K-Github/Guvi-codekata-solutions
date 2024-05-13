# import json
# from io import StringIO
# from functools import reduce

# def total_score(scores):
#     #..... YOUR CODE STARTS HERE .....
#     return reduce(lambda x, y: x + y, scores)


#     #..... YOUR CODE ENDS HERE .....

# def clean_input(value):
#     return json.load(StringIO(value))

# if __name__ == "__main__":
#     scores = clean_input(input().strip())

#     print(total_score(scores))
    
#==============================================================================================

# -----------
# Source code:
# -----------

import json
from io import StringIO
from functools import reduce

def total_score(scores):
    #..... YOUR CODE STARTS HERE .....
    return reduce(lambda x, y: x + y, scores)


    #..... YOUR CODE ENDS HERE .....

def clean_input(value):
    return json.load(StringIO(value))

if __name__ == "__main__":
    scores = clean_input(input().strip())

    print(total_score(scores))
