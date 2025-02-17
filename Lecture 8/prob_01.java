//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class prob_01 {
    public static int averageCal(int a,int b,int c){
        int average=(a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Number:");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd Number:");
        int b=sc.nextInt();
        System.out.print("Enter the 3rd Number:");
        int c=sc.nextInt();
        System.out.println("Average of "+a+" "+b+" and "+c+" is "+averageCal(a, b, c));
         
    }
    
}
/*
Enter the 1st Number:12
Enter the 2nd Number:13
Enter the 3rd Number:11
Average of 12 13 and 11 is 12
 */
