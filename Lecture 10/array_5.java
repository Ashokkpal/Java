//Take an array as input from the user.search for a given number x and print the index which is occur

import java.util.Scanner;

public class array_5 {
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size of Array:");
        int size=sc.nextInt();
        int myArray[]=new int[size];
        for (int i = 0; i < size; i+=1) {
            myArray[i]=sc.nextInt();
        }
        System.out.print("Enter x:");
        int x=sc.nextInt();
        for (int i = 0; i <size; i+=1) {
            
            if (myArray[i]==x){
            System.out.println("x found in index "+i);

        }

            
        }
    }
}
/*
Enter your size of Array:4
2
3
4
5
Enter x:5
x found in index 3 */

        
    

