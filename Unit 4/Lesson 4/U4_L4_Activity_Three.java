/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Strings:");
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = "";
        int d = 1;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length() * 2; i++) {
                if (i % 2 == 0) {
                    System.out.print(a.substring(d - 1, d));
                } else {
                    System.out.print(b.substring(d - 1, d));
                    d++;
                }
            }

        } else {
            System.out.println("error");
        }

    }
}