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
        String input = "programming";
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            if (count == 1) {
                System.out.println(currentChar);
                break;
            }
        }
    }
}
