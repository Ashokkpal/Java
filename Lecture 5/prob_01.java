//Print a solid rhombus
public class prob_01 {
    public static void main(String...args) {
        for(int i=1;i<=5;i+=1){
            for(int j=4;j>=i;j-=1){
                System.out.print(" ");
            }for(int j=4;j<=i;j+=1){
                System.out.print("*");
            }
            for(int j=1;j<=i;j+=1){
                System.out.print(" ");
            }
            System.out.println();
                }        
    }
    
}
