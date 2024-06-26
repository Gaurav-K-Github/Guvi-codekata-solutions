# You are required to implement a Python program for managing employee salaries. The program should define an Employee class with the following methods:

# getInfo(salary, hours_worked): This method takes the salary and the number of hours worked per day by the employee as input parameters.
# AddSal(): This method adds $100 to the salary of the employee if it is less than $500.
# AddWorkSal(amount): This method adds a specified amount to the salary of the employee.
# Input:

# The input consists of the following:

# The first line contains two integers separated by a space: employee_id and option. employee_id is an integer representing the ID of the employee (always 1 for this problem). option is an integer representing the selected operation (1 for getInfo(), 2 for AddSal(), and 3 for AddWorkSal()).
# If option is 1 (getInfo()), the second line contains two integers separated by a space: salary (an integer) and hours_worked (an integer).
# if the option is 2, there will be no second line input
# If option is 3 (AddWorkSal()), the second line contains an integer amount representing the amount to be added to the salary.
# Output:

# Print the following:

# For options 1 and 3, output the final salary of the employee after performing the operation.
# For option 2, print the updated salary
# Note

# The initial salary of the employee is $100.
# The final salary of the employee should be output with a '$' symbol.
# Sample Input:

# 1 1
# 200 8

# Sample Output:

# 200$

# ==============================================================================================
# -----------

# Source code:
# -----------

# Notification interface
class Employee:
  def __init__(self):
      self.salary = 100  # Initial salary is $100

  def getInfo(self, salary, hours_worked):
      self.salary = salary
      self.hours_worked = hours_worked

  def AddSal(self):
      if self.salary < 500:
          self.salary += 100

  def AddWorkSal(self, amount):
      self.salary += amount


# Main function
def main():
  employee = Employee()
  employee_id, option = map(int, input().split())

  if option == 1:
      salary, hours_worked = map(int, input().split())
      employee.getInfo(salary, hours_worked)
      print(f"{employee.salary}$")
  elif option == 2:
      employee.AddSal()
      print(f"{employee.salary}$")
  elif option == 3:
      amount = int(input())
      employee.AddWorkSal(amount)
      print(f"{employee.salary}$")

if __name__ == "__main__":
  main()
