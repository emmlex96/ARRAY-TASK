import java.util.Scanner;

public class ArrayInput {

    public static int[] collectTenIntegers() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int num = 0; num < 10; num++) {
            System.out.print("Number " + (num + 1) + ": ");
            numbers[num] = input.nextInt();
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] arr = collectTenIntegers();

        System.out.print("You entered: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
