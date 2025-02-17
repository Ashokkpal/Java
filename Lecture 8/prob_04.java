//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class prob_04 {
public static double circumferenceWithRadius(int r) {
        double circumference=(2 * 3.14 * r);
        return circumference;
    }
    public static void main(String...arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        int n = sc.nextInt();
 
 
        System.out.println("circumference of radius "+n+" is="+circumferenceWithRadius(n));
    }
 }
 /*
Enter the value of radius:12
circumference of radius 12 is=75.36
  */