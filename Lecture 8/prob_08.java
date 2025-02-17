//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class prob_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        
        double result = power(x, n);
        
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        
        scanner.close();
    }
    
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }
}
/*
Enter the base (x): 3
Enter the exponent (n): 4
3.0 raised to the power of 4 is: 81.0
 */
    

