//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class prob_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (or type 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}

/*
Enter a number (or type 'exit' to finish): 5
Enter a number (or type 'exit' to finish): -3
Enter a number (or type 'exit' to finish): 0
Enter a number (or type 'exit' to finish): 7
Enter a number (or type 'exit' to finish): -1
Enter a number (or type 'exit' to finish): exit
Count of positive numbers: 3
Count of negative numbers: 2
Count of zeros: 1

 */
    