public class U6_L3_Activity_One {

    public static String findLongest(String[] words) {
        // Implement code to find and return the longest String in wordList

        int s = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[s].length() < words[i].length()) {
                s = i;
            }
        }

        return words[s];

    }

}
