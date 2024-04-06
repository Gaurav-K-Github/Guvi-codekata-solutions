# The input consists of the following:

# Number of rows for the first matrix (mat1).
# Number of columns for the first matrix (mat1).
# Values of each element of the first matrix (mat1) in row-major order.
# Number of rows for the second matrix (mat2).
# Number of columns for the second matrix (mat2).
# Values of each element of the second matrix (mat2) in row-major order.
# Output:

# After inputting both matrices, print each resultant element of the matrix multiplication in a loop.

# Sample Input:

# 2
# 2
# 2 2 2 2
# 2
# 2
# 2 2 2 2

# Sample Output:

# 8 8 8 8

# ==============================================================================================
# -----------
# Source code:
# -----------


class Matrix:
  def __init__(self, rows, columns, values):
      self.rows = rows
      self.columns = columns
      self.matrix = [[values[i * columns + j] for j in range(columns)] for i in range(rows)]

  def get_rows(self):
      return self.rows

  def get_columns(self):
      return self.columns

  def set_element(self, i, j, value):
      self.matrix[i][j] = value

  def multiply(self, other):
      if self.columns != other.rows:
          print("Matrix multiplication not possible")
          return

      result_rows = self.rows
      result_columns = other.columns
      result = [[0 for _ in range(result_columns)] for _ in range(result_rows)]

      for i in range(result_rows):
          for j in range(result_columns):
              for k in range(self.columns):
                  result[i][j] += self.matrix[i][k] * other.matrix[k][j]

      return result


def main():
  # Input for first matrix
  mat1_rows = int(input())
  mat1_columns = int(input())
  mat1_values = list(map(int, input().split()))

  # Input for second matrix
  mat2_rows = int(input())
  mat2_columns = int(input())
  mat2_values = list(map(int, input().split()))

  # Create matrices
  matrix1 = Matrix(mat1_rows, mat1_columns, mat1_values)
  matrix2 = Matrix(mat2_rows, mat2_columns, mat2_values)

  # Multiply matrices
  result_matrix = matrix1.multiply(matrix2)

  # Display result
  r = []
  for row in result_matrix:
      for elem in row:
          r.append(str(elem))  # Convert integer to string
  p = " ".join(r)
  print(p)


if __name__ == "__main__":
  main()
