/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user. */

import java.util.Scanner;

public class prob_1 {
    public static void main(String...args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int num1=Sc.nextInt();
        System.out.print("Enter value of b:");
        int num2=Sc.nextInt();
        int c=num1+num2;
        int d=num1-num2;
        int e=num1*num2;
        int f=num1/num2;
        int g=num1%num2;
        System.out.print("Enter otion:");
        int option=Sc.nextInt();
        switch(option){
        case 1:System.out.println("a+b= "+ c );
        break;
        case 2:System.out.println("a-b= "+ d );
        break;
        case 3:System.out.println("a*b= "+ e );
        break;
        case 4:System.out.println("a/b= "+ f );
        break;
        case 5:System.out.println("a%b= "+ g );
        break;
        default:System.out.println("Invalid");
        }

        }

    }
    

