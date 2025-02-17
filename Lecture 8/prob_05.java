//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class prob_05 {
    public static void eligibleToVote(int a){
        if (a>=18) {
            System.out.println("You are eligible for vote");
            
        }else{System.out.println("Not eligible for vote");}
    }
    public static void main(String...args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Your age:");
     int age=sc.nextInt();

     eligibleToVote(age);
 }
      }
/*
Enter Your age:34
You are eligible for vote
Enter Your age:12
Not eligible for vote
 */
    