import java.util.*;

public class o1_2dArray {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter row:");
        int row=scanner.nextInt();
        System.out.print("Enter coloumn:");
        int coloumn=scanner.nextInt();
        scanner.nextLine();
        int matrixArray[][]=new int [row][coloumn];
        for(int i=0;i<row;i+=1){
            for (int j = 0; j <coloumn; j+=1) {
                matrixArray[i][j]=scanner.nextInt();
                
            }
        }
        for (int i = 0; i <row; i+=1) {
            for (int j = 0; j < coloumn; j+=1) {
                System.out.print(matrixArray[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();



    }

    
}