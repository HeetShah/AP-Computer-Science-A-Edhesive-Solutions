/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four {

    /* Add the method realTime here */
    public static void realTime(int a) {
        int totalMin = a / 60;
        int hours = totalMin / 60;
        int min = totalMin % 60;
        int seconds = a % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + seconds);
    }

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for
    // a score
    /*
     * public static void main(String[] args){
     * 
     * }
     */
}