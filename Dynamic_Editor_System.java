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
package JavaIgniteDay9;

public class Dynamic_Editor_System {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			StringBuilder sb = new StringBuilder("");
			System.out.println("Start: "+sb.insert(0,"Java"));
			System.out.println("Insert: Programming");
			sb.append(" Programming");
			System.out.println("String: "+sb);
			System.out.println("Delete: Java");
			sb.delete(0,5);
			System.out.println("String: "+sb);
			System.out.println("Replace: Programming -> Coding");
			sb.replace(0, 11, "Coding");
			System.out.println("String: "+sb);
			System.out.println("Reverse string: "+sb.reverse());
			
		}

	}

