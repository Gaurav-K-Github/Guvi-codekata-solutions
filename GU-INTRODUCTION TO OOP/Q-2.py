# You are required to implement a class called 'Matrix' containing a constructor that initializes the number of rows and the number of columns of a new Matrix object. The Matrix class should have the following methods:

# print_rows(): Print the number of rows of the matrix.
# print_cols(): Print the number of columns of the matrix.
# print_elements(): Print the elements of the matrix in the form of a 2D array.
# If the input is invalid, print 'invalid'.

# Input:

# The input consists of a single line in the format rowsxcols total_elements, where rows and cols are integers representing the number of rows and columns of the matrix respectively, and total_elements is the total number of elements in the matrix. This is followed by the elements of the matrix, each element separated by a space.

# Output:

# Output the number of rows and columns of the matrix on separate lines, followed by the elements of the matrix in the form of a 2D array.

# Constraints:

# The total number of elements in the matrix must equal rows * cols.

# Sample Input:

# 3x3 9
# 1 2 3
# 4 5 6
# 7 8 9

# Sample Output:

# 3
# 3
# 1 2 3
# 4 5 6
# 7 8 9

# ==============================================================================================
# -----------

# Source code:
# -----------

class Matrix:
  def __init__(self, rows, cols):
      self.rows = rows
      self.cols = cols

  def print_rows(self):
      if self.rows > 0:
          return f"{self.rows}"
      else:
          return "Invalid"

  def print_cols(self):
      if self.cols > 0:
          return f"{self.cols}"
      else:
          return "Invalid"

  def print_matrix(self):
      if self.rows > 0 and self.cols > 0:
          return f"{self.rows}x{self.cols}"
      else:
          return "Invalid"


# Main function
def main():
  size_input, option = input().split()
  rows, cols = map(int, size_input.split("x"))
  matrix = Matrix(rows, cols)

  if option == "1":
      print(matrix.print_rows())
  elif option == "2":
      print(matrix.print_cols())
  elif option == "3":
      print(matrix.print_matrix())
  else:
      print("Invalid")


if __name__ == "__main__":
  main()
