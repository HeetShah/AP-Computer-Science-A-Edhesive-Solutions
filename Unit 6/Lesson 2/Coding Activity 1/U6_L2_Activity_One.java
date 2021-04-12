public class U6_L2_Activity_One {

    // Write your allNegative method here
    public static boolean allNegative(double[] arr1) {

        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                flag = false;
            }
        }

        return flag;

    }

}
