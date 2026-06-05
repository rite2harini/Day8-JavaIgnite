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

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean repeated = false;
            
            for(int j = 0; j < s.length(); j++) {
                if(i != j && c == s.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            
            if(!repeated) {
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }
        
        sc.close();
    }
}
