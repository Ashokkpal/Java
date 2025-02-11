/*Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */

 import java.util.Scanner;

 public class prob_2 {
     public static void main(String... args) {
         Scanner scanner = new Scanner(System.in); // Initialize the Scanner
         int choice;
 
         do {
             System.out.print("Enter 1 to enter student marks or 0 to stop: ");
             choice = scanner.nextInt();
 
             if (choice == 1) {
                 double marks;
                 do {
                     System.out.print("Enter student's marks (out of 100): ");
                     marks = scanner.nextDouble();
 
                     if (marks < 0 || marks > 100) {
                         System.out.println("Please enter marks between 0 and 100.");
                         continue; // Skip to the next iteration of the loop
                     }
 
                     if (marks >= 90) {
                         System.out.println("This is Good");
                     } else if (marks >= 60) {
                         System.out.println("This is also Good");
                     } else if (marks >= 0) {
                         System.out.println("This is Good as well");
                     }
 
                     // Ask if the user wants to enter more marks
                     System.out.print("Do you want to enter more marks? (yes=1/no=0): ");
                     choice = scanner.nextInt();
                 } while (choice == 1); // Continue if the user wants to enter more marks
             } else if (choice != 0) {
                 System.out.println("Invalid choice. Please enter 1 or 0.");
             }
         } while (choice != 0); // Continue until the user chooses to stop
 
         System.out.println("Exiting the program.");
         scanner.close(); // Close the Scanner
     }
 }