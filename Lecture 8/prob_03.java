//Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;

public class prob_03 {
public static int greatesOfTwo(int a,int b){
    if (a>b) {
        System.out.println(a+" is greates");
        return a;
        
    }else{
        System.out.println(b+" is greates number");
        return b;
    }
    }
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fast number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        greatesOfTwo(num1, num2);
        
    }
}
/*
Enter fast number:12
Enter second number:15
15 is greates number
 */
