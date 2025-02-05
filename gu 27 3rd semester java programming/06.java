import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         //..... YOUR CODE STARTS HERE .....
        while (true) {
            
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            
            if (month == -1 && year == -1) {
                break;
            }

            if (month < 1 || month > 12 || year < 0) {
                System.out.println("Invalid input");
            } else {
                int days;
                switch (month) {
                    case 1: days = 31; break;
                    case 2:
                        // Check for leap year
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                        break;
                    case 3: days = 31; break;
                    case 4: days = 30; break;
                    case 5: days = 31; break;
                    case 6: days = 30; break;
                    case 7: days = 31; break;
                    case 8: days = 31; break;
                    case 9: days = 30; break;
                    case 10: days = 31; break;
                    case 11: days = 30; break;
                    case 12: days = 31; break;
                    default: days = -1; break; // Invalid month
                }
                
                if (days == -1) {
                    System.out.println("Invalid month");
                } else {
                    System.out.println(days);
                }
            }
        }

        
        
        //..... YOUR CODE ENDS HERE .....
       scanner.close();

    }
}
        
