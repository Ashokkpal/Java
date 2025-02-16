//Find the factorial of a number

import java.util.Scanner;

public class o4_demo {
public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
 
 
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
 
 
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
 
 
        printFactorial(n);
    }
 }
 /*
Enter the value of N:6
720
  */