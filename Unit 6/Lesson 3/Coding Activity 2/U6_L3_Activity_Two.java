public class U6_L3_Activity_Two {

    public static void reverse(String[] words) {
        // Implement code to print each string from words backwards on a new line

        for (int i = 0; i < words.length; i++) {
            String output = ""; // have to clean the output everytime it goes to the next index
            for (int x = words[i].length(); x > 0; x--) {
                output = output + words[i].substring(x - 1, x);

            }
            System.out.println(output); // put this outside the loop so the whole word is done generating
        }

    }

}
