import java.util.Scanner;

public class o3_demo {
    public static void main(String... args) {
        //input
        Scanner Sc=new Scanner (System.in);
        System.out.print("Enter your 1st Number:");
        int Num1=Sc.nextInt(); 
        System.out.print("Enter your 2nd Number:");
        int Num2=Sc.nextInt();
        if(Num1==Num2){
            System.out.println("Equal");}
        else if(Num1>Num2){
            System.out.println("num1 is greater");}
            else{
                System.out.println("num1 is less");}
        
    }
}
