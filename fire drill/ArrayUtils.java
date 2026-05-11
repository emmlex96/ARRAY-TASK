public class ArrayUtils {

    public static int[] removeEvenNumbers(int[] arr) {

        int oddCount = 0;
        for (int num : arr) {
            if (num % 2!= 0) {
                oddCount++;
            }
        }


        int[] odds = new int[oddCount];
        int index = 0;
        for (int num : arr) {
            if (num % 2!= 0) {
                odds[index] = num;
                index++;
            }
        }

        return odds;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] oddsOnly = removeEvenNumbers(original);

        System.out.print("Original: ");
        for (int digit : original) System.out.print(digit + " ");

        System.out.println("Odds only: ");
        for (int digit : oddsOnly) System.out.print(digit + " ");
    }
}
