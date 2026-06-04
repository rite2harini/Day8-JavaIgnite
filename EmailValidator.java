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
import java.util.Scanner;
public class Email_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email:");
		String string = sc.nextLine();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='@')
			{
				for(int j=0;j<string.length();j++)
				{
					if(string.charAt(j)=='.')
					{
						System.out.println("Valid email! Proceed!");
						return;
					}
				}
			}
		}
		System.out.println("Invalid email!");
		sc.close();
	}

}
