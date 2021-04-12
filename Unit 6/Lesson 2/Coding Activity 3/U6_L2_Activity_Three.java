public class U6_L2_Activity_Three {

    // Write your hasDuplicates method here

    public static boolean hasDuplicates(int[] arr1) {

        int x = 0;

        for (int i = 0; i < arr1.length; i++) {
            x = arr1[i];
            for (int y = 1; y < arr1.length; y++) {
                if (arr1[y] == x && i != y) {
                    return true;
                }
            }
        }

        return false;

    }

}
