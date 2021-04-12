public class U6_L3_Activity_Three {

    // Write your printIngs method here

    public static void printIngs(String[] arr1) {
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i].length() > 3) {
                if (arr1[i].substring(arr1[i].length() - 3, arr1[i].length()).equals("ing")) {
                    System.out.println(arr1[i]);
                }
            }

        }
    }

}
