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
package java_internship_day9;
import java.util.Scanner;
public class Dynamic_Editor_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		str = "Java";
		System.out.println("Start :" +str);
		StringBuilder sb = new StringBuilder(str);
		sb.append(" Programming");
		System.out.println("After insert : "+sb);
		sb.delete(0,4);
		System.out.println("After delete :"+ sb);
		sb.replace(0, sb.length(),"Coding");
		System.out.println("After replace :"+ sb);
		sb.reverse();
		System.out.println("After reverse :"+ sb);
		sc.close();
	}

}
