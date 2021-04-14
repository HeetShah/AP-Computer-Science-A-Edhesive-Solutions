public class U6_L4_Activity_One {

    // Write your insert method here

    public static boolean insert(String[] words, String newWord, int place) {

        if (place >= words.length || place < 0) {
            return false;
        } else {

            for (int i = words.length - 1; i > place; i--) {
                words[i] = words[i - 1];
            }
            words[place] = newWord;
        }

        return true;

    }

}
