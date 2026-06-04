/*
First Non-Repeating Character

Create a program that:

Takes a string input
Finds the first character that does NOT repeat
Example:
Input: programming
Output: p
Hint:

You need frequency logic using loops.
*/
package day9_progs;
import java.util.Scanner;

public class first_nonReapting_char {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String → ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == curr) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println("First non-repeating character = " + curr);
                break;
            }
        }
        sc.close();
    }
}
