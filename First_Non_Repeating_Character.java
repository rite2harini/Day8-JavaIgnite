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

public class First_non_repeating {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String string = sc.nextLine();

        for(int i = 0; i < string.length(); i++)
        {
            int count = 0;

            for(int j = 0; j < string.length(); j++)
            {
                if(string.charAt(i) == string.charAt(j))
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.println("First non repeating character: " + string.charAt(i));
                return;
            }
        }

        System.out.println("All characters in the given string were repeating");
        sc.close();
    }
}
