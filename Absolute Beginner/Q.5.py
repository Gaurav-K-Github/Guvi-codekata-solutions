# You will be provided with a number. Print the number of days in the month corresponding to that number.

# Note: In case the input is February, print 28 days. If the Input is not in valid range print "Error".

# Input Description:
# The input is in the form of a number.

# Output Description:
# Find the days in the month corresponding to the input number. Print Error if the input is not in a valid range.

# Sample Input :
# 8
# Sample Output :
# 31

#==============================================================================================
# -----------
# Source code:
# -----------

month_number = int(input())

if month_number < 1 or month_number > 12:
    print("Error")
else:
    days_in_month = {
        1: 31,
        2: 28,
        3: 31,
        4: 30,
        5: 31,
        6: 30,
        7: 31,
        8: 31,
        9: 30,
        10: 31,
        11: 30,
        12: 31
    }

    num_days = days_in_month[month_number]

    print(num_days)
