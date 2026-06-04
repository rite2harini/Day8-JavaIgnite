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
import java.util.Scanner;
public class StringBuilder_only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = sc.nextLine();
		sb.insert(0, string);
		System.out.println("Inserting at end: Programming");
		sb.append(" Programming");
		System.out.println("String: "+sb);
		System.out.println("Insert at middle: Easy");
		sb.insert(4," Easy");
		System.out.println("String: "+sb);
		System.out.println("Replace: Easy -> Powerful");
		sb.replace(5, 9, "Powerful");
		System.out.println("String: "+sb);
		System.out.println("Reverse string: "+sb.reverse());
		sc.close();
	}

}
