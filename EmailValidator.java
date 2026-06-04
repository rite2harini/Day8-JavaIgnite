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
package day9_progs;
import java.util.Scanner;
public class email_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter email → ");
		String email = sc.nextLine();

		boolean hasAt = false;
		boolean hasDot = false;

		for(int i = 0; i < email.length(); i++) {
		    if(email.charAt(i) == '@')
		        hasAt = true;

		    if(email.charAt(i) == '.')
		        hasDot = true;
		}

		if(hasAt && hasDot)
		    System.out.println("Valid Email");
		else
		    System.out.println("Invalid Email");
		sc.close();
		
	}

}
