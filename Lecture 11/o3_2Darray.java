//Searching for an element x in a matrix.

import java.util.Scanner;

public class o3_2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row");
        int row=sc.nextInt();
        System.out.print("Enter colm");
        int colm=sc.nextInt();
        int matrix2[][]=new int[row][colm];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < colm; j++) {
                matrix2[i][j]=sc.nextInt();
                
            }
          }System.out.print("Enter the x");
          int x=sc.nextInt();
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < colm; j++) {
                if(x==matrix2[i][j]){
                    System.out.print(x+" found in "+i+","+j+" place");
                }}}



    }
    
}
