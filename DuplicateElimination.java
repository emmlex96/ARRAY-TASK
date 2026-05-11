import java.util.Scanner;
public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int num = 0; num < 10; num++) {
            numbers[num] = -1;
        }
        for (int num = 0; num < 10; num++) {
            int digit;
            while (true) {
                System.out.print("Enter number " + (num + 1) + " (10-100): ");
                digit = input.nextInt();
                if (digit >= 10 && digit <= 100) {
                    break;
                }
                System.out.println("Invalid input. Enter an integer between 10 and 100.");
            }
            numbers[num] = digit;
        }


        for (int num = 0; num < numbers.length; num++) {
            
