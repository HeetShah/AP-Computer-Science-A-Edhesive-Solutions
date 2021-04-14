public class U6_L4_Activity_Two {

    // Write the methods swap and allSwap here

    public static void swap(int[] arr, int i, int j) {

        if (i <= arr.length - 1 && j <= arr.length - 1) {
            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;

        }

    }

    public static void allSwap(int[] arr) {

        if (arr.length % 2 == 0) {

            for (int i = 0; i < arr.length - 1; i += 2) {

                int current = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = current;

            }

        }
    }

}
