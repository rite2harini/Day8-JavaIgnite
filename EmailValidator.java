/*
Create a program that:

Takes a string input

Print:

Uppercase version
Lowercase version
Example:
Input: Java
Output:
JAVA
java
*/
package java_internship_day9;
import java.util.Scanner;
public class Email_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int i;
		System.out.println("Enter a email :");
		str = sc.nextLine();
		int c=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='@')
				c++;
		}
		if(c==0)
			System.out.println("Not valid");
		else
			System.out.println("Valid");
		sc.close();
	}

}
