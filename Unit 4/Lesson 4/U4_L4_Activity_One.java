/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);

        System.out.println("Input String:");
        String input = scan.nextLine();
        input = input.toLowerCase();

        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("sh")) {
                count++;
            }
        }

        System.out.println("Contains \"sh\" " + count + " times.");

    }
}