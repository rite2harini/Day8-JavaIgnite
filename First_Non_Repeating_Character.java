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
package JavaIgniteDay9;
import java.util.Scanner;

public class First_Non_Repeating_Character {

			    public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);

			        System.out.print("Enter a string: ");
			        String str = sc.nextLine();

			        boolean found = false;

			        for (int i = 0; i < str.length(); i++) {
			            char ch = str.charAt(i);
			            int count = 0;

			            for (int j = 0; j < str.length(); j++) {
			                if (ch == str.charAt(j)) {
			                    count++;
			                }
			            }

			            if (count == 1) {
			                System.out.println("First Non-Repeating Character: " + ch);
			                found = true;
			                break;
			            }
			        }

			        if (!found) {
			            System.out.println("No non-repeating character found.");
			        }

			        sc.close();
			    }
}
