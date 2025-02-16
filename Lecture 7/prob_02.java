//Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class prob_02 {
    public static void evenOrOdd(int n){
        if(n%2==0){
        System.out.println("Even");}
        else{System.out.println("Odd");}
        return;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number:");
        int n=sc.nextInt();
        evenOrOdd(n);
        
    }
    
}
/*
Enter your Number:3
Odd
 */
