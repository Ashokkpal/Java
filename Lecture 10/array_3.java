import java.util.Scanner;

public class array_3 {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your size of Array:");
        int size=scanner.nextInt();
        int myArray[]=new int[size];
        //input
        for (int i = 0; i <size; i++) {
            myArray[i]=scanner.nextInt();
            
        }
        //output
        for(int i = 0; i<size; i+=1) {
            System.out.println(myArray[i]);
            
        }//Default int array value "0"
    }
    
}
/*
Enter your size of Array:5
1
2
3
4
5
1
2
3
4
5 */
