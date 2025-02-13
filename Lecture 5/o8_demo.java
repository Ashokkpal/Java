//Floyd's triangle
public class o8_demo {
public static void main(String...args) {
    int i;int j;int sum=1;
    for(i=1;i<=5;i+=1){
        for(j=1;j<=i;j+=1){
            System.out.print(sum+" ");
            sum+=1;
        }System.out.println();
    }
    

        
    }
}/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */
