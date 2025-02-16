//make a function to multiply 2 numbers and return the multiply  

import java.util.Scanner;
public class o3_demo {
    public static int calculatMulti(int a,int b){
        return a*b;
    }
    public static void main(String...args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of A:");
     int A=sc.nextInt();
     System.out.print("Enter the value of B:");
     int B=sc.nextInt();
     System.out.println("Product of a & b is "+calculatMulti(A, B));
}
}
/*
Enter the value of A:12
Enter the value of B:14
Product of a & b is 168
 */
    