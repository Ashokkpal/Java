// Print all even numbers till n.

import java.util.Scanner;

public class prob_1 {
    public static void main(String...args){
     Scanner Sc=new Scanner(System.in);
     System.out.print("Enter N:");  
     int num=Sc.nextInt();
    
     for(int i=1;i<=num;i+=1){
        if (i%2!=0) {
            System.out.println(i);
            
        }

     }
        
     }
        

    }

        