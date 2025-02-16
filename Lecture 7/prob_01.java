//Make a function to check if a number is prime or not.

import java.util.Scanner;

public class prob_01 {
public static void primeOrNotprime(int n){
    if (n%2==0 || n%3==0) {
        System.out.println("Not prime");
        return;
        }
        else{System.out.println("prime number");
            
        }
} 
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        primeOrNotprime(n);
    }
}
/*
Enter Your Number:43
prime number
 */
