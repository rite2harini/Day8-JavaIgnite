/*
Create a program that:

Takes a string input using StringBuilder

Perform the following operations:

Tasks:
Append a word at the end
Insert a word in the middle
Replace part of the string
Reverse the final string
Example Flow:
Input: Java
Append: Programming
Insert: "Easy" in middle
Replace: "Easy" → "Powerful"
Reverse final string
Rules:
Must use StringBuilder only
Do not convert back to String for operations
*/
package java_internship_assignment;
import java.util.Scanner;

public class textprocessorsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter your string");
		str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.append(" Programming"));
		int mid=sb.length()/2;
		sb.insert(mid," quick ");
		System.out.println(sb);
		int start=sb.indexOf("quick");
		int end=start+"quick".length();
		System.out.println(sb.replace(start,end,"powerful "));
		System.out.println(sb.reverse());
		
		

	}

}


