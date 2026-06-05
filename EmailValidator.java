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
package JavaIgniteDay9;
import java.util.Scanner;

public class Email_Validator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String:");
			String string = sc.nextLine();
			
			System.out.println("Upper case: "+string.toUpperCase());
			System.out.println("Lower case: "+string.toLowerCase());
			sc.close();
		}

	}
