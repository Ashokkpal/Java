public class array_1 {
    public static void main(String...args) {
        int[]marks=new int[3];
        marks[0]=95;//physis marks
        marks[1]=97;//math marks
        marks[2]=93;//chemistry marks
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        //System.out.println(marks);   not print all array value same place,print garbadge value like [I@372f7a8d,i can use loop like
        for(int i=0;i<3;i+=1){
            System.out.println(marks[i]);
        }
        
    }
    
}
/*
95
97
93
 */
