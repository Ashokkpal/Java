import java.util.Scanner;

public class o4_demo {
    public static void main(String...arg){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter your Button:");
        int Button=Sc.nextInt();
        if (Button==1) {
            System.out.println("Hello");
            }
        else if (Button==2) {
                System.out.println("Namaskar");
                 }
        else if (Button==3) {
                    System.out.println("Hola");
            
                 }else{System.out.println("invalid input");
                }
    }
    
}
