# You are tasked with implementing a credit score calculation system for banks. Each bank must adhere to rules set by the Reserve Bank of India (RBI), and any changes made by the RBI must be universally followed by all banks.

# The RBI has announced a new rule: a fixed credit score percentage to be applied to all transactions. According to this rule, for every transaction, 10% of the transaction amount will be added to the customer's credit score.

# You need to implement a system with the following classes:

# Banks: An interface with a method calculateCreditScore() that returns a double.
# RBI: A class that implements the Banks interface. It has private data members accountNumber (string), creditScore (double), and holderName (string). It also has a fixed variable CREDIT (double) set to 10%. Implement the calculateCreditScore() method and a display() method.
# ICICI: A class that extends RBI.
# HDFC: A class that extends RBI.
# Your task is to implement the required classes and methods to calculate the credit score for a customer based on the given rules. Ensure that the credit score is rounded to two decimal places.

# Input:

# The input consists of a single line containing the following space-separated values:

# An integer representing the bank: 1 for ICICI, 2 for HDFC.
# The holder's name (string).
# The account number (string).
# The previous credit score (double).
# The amount to be paid (double).
# Output:

# Print the following:

# The bank type (string).
# The account number (string).
# The updated credit score (double, rounded to two decimal places).
# A message indicating the credit gained for the payment and the total credit score.
# Note

# Ensure that the credit score is rounded to two decimal places in the output.

# Sample Input:

# 1 MadhanKumar 218463 652 500

# Sample Output:

# Hi, MadhanKumar You have gained 50.00 credit score for the payment of 500.0 Your Total Credit Score is 702.00
# ==============================================================================================
# -----------
# Source code:
# -----------


class Banks:
    def calculateCreditScore(self, amount):
        pass  # To be implemented in subclasses


class RBI(Banks):
    def __init__(self, holderName, accountNumber, creditScore):
        self.holderName = holderName
        self.accountNumber = accountNumber
        self.creditScore = creditScore
        self.CREDIT = 0.10  # 10% credit addition for each transaction

    def calculateCreditScore(self, amount):
        credit_gained = round(amount * self.CREDIT, 2)
        self.creditScore += credit_gained
        return credit_gained, self.creditScore

    def display(self, credit_gained, amount):
        print(f"Hi, {self.holderName} You have gained {credit_gained:.2f} credit score for the payment of {amount} Your Total Credit Score is {self.creditScore:.2f}")


class ICICI(RBI):
    def __init__(self, holderName, accountNumber, creditScore):
        super().__init__(holderName, accountNumber, creditScore)


class HDFC(RBI):
    def __init__(self, holderName, accountNumber, creditScore):
        super().__init__(holderName, accountNumber, creditScore)


# Main function
def main():
    bank_type, holderName, accountNumber, previousCreditScore, amount = input().split()
    previousCreditScore = float(previousCreditScore)
    amount = float(amount)

    if bank_type == "1":
        bank = ICICI(holderName, accountNumber, previousCreditScore)
    elif bank_type == "2":
        bank = HDFC(holderName, accountNumber, previousCreditScore)

    credit_gained, updated_credit_score = bank.calculateCreditScore(amount)
    bank.display(credit_gained, amount)


if __name__ == "__main__":
    main()
