/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
package JavaIgniteDay9;
import java.util.Scanner;

public class String_Compression {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
        String string = sc.nextLine();

        int count = 1;
        System.out.println("Compressed string:");
        for(int i = 0; i < string.length(); i++)
        {
            while(i < string.length() - 1 &&
                  string.charAt(i) == string.charAt(i + 1))
            {
                count++;
                i++;
            }

            System.out.print(string.charAt(i));
            System.out.print(count);

            count = 1;
        }

        sc.close();
    }
}
