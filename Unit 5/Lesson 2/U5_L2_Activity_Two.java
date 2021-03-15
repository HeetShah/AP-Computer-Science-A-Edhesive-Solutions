/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two {

    /* Add the method reverser here */
    public static void reverser(String word) {
        String newStr = "";
        for (int i = word.length(); i > 0; i--) {
            newStr += word.substring(i - 1, i);
        }
        System.out.println(newStr);
    }

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for
    // a score

    // public static void main(String[] args){
    // Scanner scan = new Scanner (System.in);
    // String input = scan.nextLine();
    // reverser(input);
    // }

}