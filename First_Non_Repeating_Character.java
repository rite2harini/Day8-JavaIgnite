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
package java_internship_day9;
import java.util.Scanner;
public class FirstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		
		int count,i,j;
		System.out.println("Enter the word :");
		str = sc.nextLine();
		for(i=0;i<str.length();i++) {
			count =0;
			for(j=0;j<str.length();j++)
				if(str.charAt(i) == str.charAt(j))
					count++;
			if(count == 1) {
				System.out.printf("%c is the first non reapeating letter",str.charAt(i));
				break;
			}
		}
		
		sc.close();
	}

}
