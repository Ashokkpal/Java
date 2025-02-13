//Hollow rectangular pattern

import java.util.Scanner;

class o1_demo{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coloum:");
        int num1=sc.nextInt();
        System.out.print("Enter row:");
        int num2=sc.nextInt();
        for(int i=1;i<=num1;i+=1){
            for(int j=1;j<=num2;j+=1){
                if(i==1||i==num1||j==1||j==num2){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }System.out.print(" ");
            }System.out.println();

        }

    }
}
/*
Enter coloum:4
Enter row:6
* * * * * * 
*         *
*         *
* * * * * *
 */