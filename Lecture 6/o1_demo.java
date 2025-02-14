//Butterfly pattern
public class o1_demo {
public static void main(String...args){
    int n=4;
//upper half
for(int i=1;i<=n;i+=1){
    //Fast part
    for(int j=1;j<=i;j+=1){
        System.out.print("*");}
    //space
    int space=2*(n-i);
        for(int j=1;j<=space;j+=1){
        System.out.print(" ");
        
        }
        //2nd part
        for(int j=1;j<=i;j+=1){
             System.out.print("*");
        }System.out.println();

        }

    //lower half
    for(int i=n;i>=1;i-=1){
        //Fast part
        for(int j=1;j<=i;j+=1){
            System.out.print("*");}
        //space
        int space=2*(n-i);
            for(int j=1;j<=space;j+=1){
            System.out.print(" ");
            
            }
            //2nd part
            for(int j=1;j<=i;j+=1){
                 System.out.print("*");
            }System.out.println();
    
            }
    
        

    }}

/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */