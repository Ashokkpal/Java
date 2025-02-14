//palindrom number pyramid
public class o4_demo {
    public static void main(String...args){
        
        int n = 5;
       for(int i=1; i<=n; i+=1) {
           //spaces
           for(int j=1; j<=n-i; j+=1) {
               System.out.print(" ");
           }


           //first part
           for(int j=i; j>=1; j-=1) {
               System.out.print(j);
           }


           //second part
           for(int j=2; j<=i; j+=1) {
               System.out.print(j);
           }
           System.out.println();
       }
   }   
}
    
/*
    1
   212
  32123
 4321234
543212345
 */
