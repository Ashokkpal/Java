import java.util.Scanner;

public class array_4 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your array Size:");
        int size=sc.nextInt();
        int myArray[]=new int[size];
        for (int i = 0; i <size; i+=1) {
            myArray[i]=sc.nextInt();
            
        }
        System.out.print("array are:");
        for(int i=0;i<size;i+=1){
            System.out.print(myArray[i]+" ");
        }

    }
    
}
/*
Enter your array Size:3
2
4
6
array are:2 4 6  */
