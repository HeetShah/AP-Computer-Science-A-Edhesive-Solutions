/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four {

    /* Add the method hasRepeat here */
    public static boolean hasRepeat(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                return true;
            }
        }
        return false;

    }

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for
    // a score

    // public static void main(String[] args){
    // System.out.println(hasRepeat("Hoeo"));

    // }

}