public class Elementsreverse {

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int num = 0; num < arr.length; num++) {
            reversed[num] = arr[arr.length - 1 - num];
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(original);

        System.out.print("Original: ");
        for (int digit : original) System.out.print(digit + " ");

        System.out.println("Reversed:");
        for (int digit : reversed) System.out.print(digit + " ");
    }
}
