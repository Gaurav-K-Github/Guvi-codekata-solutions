# You are required to implement a program that calculates the service tax on every transaction for different types of accounts: Savings, Checking, and Demat. The service tax rates are 10%, 20%, and 5% respectively.

# Create an abstract class Account with three private data member variables: accountNumber of type String, balance of type double, holderName of type String, and methods display() and an abstract method calculateServiceTax() with an argument of type int and return type as double.

# Create the classes CheckingAccount, SavingsAccount, and DematAccount which extend the class Account. Use appropriate getters and setters for the above classes.

# Input:

# The input consists of a single line with the following information separated by space:

# Account type (1 for Checking Account, 2 for Savings Account, 3 for Demat Account)
# Holder's name
# Account number
# Current balance
# Amount to be transferred
# Output:

# Output the remaining balance after the transaction.

# Sample Input:

# 3 Rohan 562263 985.32 155

# Sample Output:

# Your remaining balance is Rs.822.57

# ==============================================================================================
# -----------

# Source code:
# -----------

class Account:
  def __init__(self, account_number, balance, holder_name):
      self.__account_number = account_number
      self.__balance = balance
      self.__holder_name = holder_name

  def display(self):
      print("Account Number:", self.__account_number)
      print("Holder's Name:", self.__holder_name)
      print("Current Balance: Rs.", self.__balance)

  def calculate_service_tax(self, transaction_amount):
      raise NotImplementedError("Subclasses must implement abstract method")


class CheckingAccount(Account):
  def calculate_service_tax(self, transaction_amount):
      service_tax_rate = 0.2
      service_tax = transaction_amount * service_tax_rate
      return service_tax


class SavingsAccount(Account):
  def calculate_service_tax(self, transaction_amount):
      service_tax_rate = 0.1
      service_tax = transaction_amount * service_tax_rate
      return service_tax


class DematAccount(Account):
  def calculate_service_tax(self, transaction_amount):
      service_tax_rate = 0.05
      service_tax = transaction_amount * service_tax_rate
      return service_tax


def main():
  input_data = input().split()
  account_type = int(input_data[0])
  holder_name = input_data[1]
  account_number = input_data[2]
  current_balance = float(input_data[3])
  amount_to_transfer = float(input_data[4])

  if account_type == 1:
      account = CheckingAccount(account_number, current_balance, holder_name)
  elif account_type == 2:
      account = SavingsAccount(account_number, current_balance, holder_name)
  elif account_type == 3:
      account = DematAccount(account_number, current_balance, holder_name)
  else:
      print("Invalid account type")
      return

  service_tax = account.calculate_service_tax(amount_to_transfer)
  remaining_balance = current_balance - amount_to_transfer - service_tax

  print("Your remaining balance is Rs.{:.2f}".format(remaining_balance))


if __name__ == "__main__":
  main()
