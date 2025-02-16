//Function

import java.util.Scanner;

public class o1_demo {
public static void  printMyName(String name){  //Declear the function
    System.out.println(name);
}
public static void main(String...args){
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enter your Name:");
    String name=Sc.nextLine();
    printMyName(name);  //Call the function
}
}
/*
Enter your Name:Disha
Disha
 */
    