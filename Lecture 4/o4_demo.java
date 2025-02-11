//print the sum natural number

import java.util.Scanner;

public class o4_demo {
    public static void main(String...args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int num=Sc.nextInt();
        int i;int sum=0;
        for(i=1;i<=num;i+=1){
            sum+=i;
         } 
         System.out.print(sum);

        
    }
    
    
}
