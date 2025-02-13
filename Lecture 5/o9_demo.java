public class o9_demo {
    public static void main(String...args) {
        int i;int j;
        for(i=1;i<=5;i+=1){
            for(j=1;j<=i;j+=1){
                int sum=(i+j);
                if(sum%2==0){
                    System.out.print("1 ");
                }else{System.out.print("0 ");}
            }System.out.println();
        }
        
    }
    
}
/* output
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 */
