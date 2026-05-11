public class ArrayUtil {

    public static int[] removeOddNumbers(int[] arr) {

        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }


        int[] even = new int[evenCount];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even[index] = num;
                index++;
            }
        }

        return even;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] evenOnly = removeOddNumbers(original);

        System.out.print("Original: ");
        for (int digit : original) System.out.print(digit + " ");

        System.out.println("Even only: ");
        for (int digit : evenOnly) System.out.print(digit + " ");
    }
}
