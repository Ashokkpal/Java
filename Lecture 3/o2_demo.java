/*Q1.Write a program to find odd and even,number from user*/

import java.util.Scanner;

public class o2_demo {
    static public void main(String...args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number:");
    int num=sc.nextInt();
    if(num % 2==0){
        System.out.println("Your Number is Even");
       }else{

        System.out.println("Your number is odd");
       }
    }
    }