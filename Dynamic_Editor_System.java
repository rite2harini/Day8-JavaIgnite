/*
StringBuilder Dynamic Editor System

Create a program that uses StringBuilder to simulate a text editor.

Operations:
Insert text
Delete part of text
Replace text
Reverse text

Example Flow:
Start: Java
Insert: Programming
Delete: Java
Replace: Programming  - Coding
Reverse final string
*/
package java_internship_assignment;
import java.util.Scanner;

public class dynamiceditorsystem {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String str=sc.nextLine();
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder(str);
		sb.insert(str.length(), " programming");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		
		int start=sb.indexOf("programming");
		int end=start+"programming".length();
		System.out.println(sb.replace(start,end,"coding"));
		
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		

	}

}

