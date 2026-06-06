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
package java_internship_assignment;

import java.util.Scanner;

public class emailvalidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email");
		String str=sc.nextLine();
		System.out.println(str);
		int i;
		
			if(str.contains("@")&&str.contains("."))
			{	
				System.out.println("Email valid");
				
			}
			else
			{	
				System.out.println("Email not valid");
			}
	
		
		
	}

}

