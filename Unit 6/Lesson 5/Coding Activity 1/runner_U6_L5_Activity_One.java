public class U6_L5_Activity_One {

    public static void reverse(String[] words) {

        for (String s : words) {
            String newStr = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                newStr += s.substring(i, i + 1);

            }
            System.out.println(newStr);
        }
    }

}
