import java.util.Scanner;

public class IT24103535Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        // Input numbers and calculate the sum
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;
        }

        // Display the numbers entered
        System.out.println("\nThe numbers you entered are:");

        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        // Calculate average
        average = (double) sum / 10;

        // Display sum and average
        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

       
    }
}