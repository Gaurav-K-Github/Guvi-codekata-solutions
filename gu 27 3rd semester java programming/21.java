import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //..... YOUR CODE STARTS HERE .....
        
        

    String input;

    //System.out.println("Enter values (press Enter without typing anything to stop):");

    while (true) {
      input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      // Improved sum calculation with exception handling
      int sum = 0;
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (Character.isDigit(ch)) {
          try {
            int digit = ch - '0';
            sum += digit;
          } catch (NumberFormatException e) {
            // Handle non-numeric characters within the input
            System.out.println("Invalid character encountered. Ignoring...");
          }
        }
      }

      System.out.println("Sum of entered integers: " + sum);
    }

    //System.out.println("Input process stopped.");
    scanner.close();
  
    
        //..... YOUR CODE ENDS HERE .....
    }
}
