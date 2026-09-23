import java.util.Scanner;

public class IT24103535Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            // Check for termination
            if (number == -99) {
                break;
            }

            // Validate negative numbers
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            // Calculate sum of squares
            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        // Calculate RMS if at least one number was entered
        if (count > 0) {
            rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered.");
        }

        
    }
}