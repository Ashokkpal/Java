/*Qs. Print if a number is prime or not (Input n from the user). 
[In this problem you will learn how to check if a number is prime or not] */

import java.util.Scanner;

public class prob_3 {

    public static void main(String...args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int num=sc.nextInt();
    if (num%2==0) {
        System.out.println("Number is Not prime");
         }else if (num%3==0) {
            System.out.println("Number is not prime");
        
         } else{System.out.println("prime number");}

        
    }
}
