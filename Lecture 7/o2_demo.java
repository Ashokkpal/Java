//make a function to add 2 numbers and return the sum  

import java.util.Scanner;

public class o2_demo {
    static public int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
public static void main(String...args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of A:");
     int A=sc.nextInt();
     System.out.print("Enter the value of B:");
     int B=sc.nextInt();
     int sum=calculateSum(A, B);
     System.out.println(sum);


    
}}
/*
Enter the value of A:12
Enter the value of B:34
46
 */

    
    