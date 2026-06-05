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
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char firstNonRepeat = ' ';
        boolean found = false;

        
        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                firstNonRepeat = str.charAt(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First Non-Repeating Character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
