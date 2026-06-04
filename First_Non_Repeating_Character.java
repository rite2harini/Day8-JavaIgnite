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
public class FirstNonRepeating {

    public static void main(String[] args) {

        String str = "programming";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            
            if (count == 1) {
                System.out.println("First Non-Repeating Character: " 
                                   + str.charAt(i));
                break;
            }
        }
    }
}
