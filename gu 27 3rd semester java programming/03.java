import java.util.Scanner;

public class guvi3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int a = scanner.nextInt();
        
        int b = scanner.nextInt();
        
        int c = scanner.nextInt();


        if (a % 2 == 0) {
            a += b;
        }

        if (b % 2 != 0) {
            c *= 2;
        }

        if (c % 3 == 0) {
            c += a;
        }

        int sum = a + b + c;

        if (sum > 100) {
            a -= 100;
            b -= 100;
            c -= 100;
        }

        // Output the transformed values
        System.out.println("a: " + a + ",b: " + b + ",c: " + c);

        // Close the scanner
        scanner.close();
    }
}
