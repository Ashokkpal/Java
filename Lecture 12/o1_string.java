import java.util.Scanner;

public class o1_string {

    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Fast Name:");
        String fastName=sc.nextLine();
        System.out.print("Enter Your last Name:");
        String lastName=sc.nextLine();
        System.out.print("Enter Your Na jana Name:");
        String naName=sc.nextLine();
        System.out.println("Your Name is "+fastName+" "+naName);
        System.out.println(lastName);
        
    }
}
/*
Enter Your Fast Name:Disha
Enter Your last Name:Bolbo na
Enter Your Na jana Name:Dhoka baj
Your Name is Disha Dhoka baj
Bolbo na */