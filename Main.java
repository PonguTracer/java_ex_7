import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int sum = 0;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            int number = scnr.nextInt();
            // Check for negative input to break the loop
            if (number < 0) {
                break;
            }

            sum += number;
            // Update the smallest number if a new smallest number is found
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
    }
}
