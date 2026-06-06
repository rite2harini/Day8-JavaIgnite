/*
First Non-Repeating Character

Create a program that:

Takes a string input
Finds the first character that does NOT repeat
Example:
Input: programming
Output: p
Hint:

You need frequency logic using loops.
*/
package java_internship_assignment;

import java.util.Scanner;

public class first_non_repeating_chracter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		String str=sc.nextLine();
		System.out.println(str);
		char letter;
		boolean isfound;
		for(int i=0;i<str.length();i++)
		{	isfound=false;
			letter=(str.charAt(i));
			for(int j=0;j<str.length();j++)
			{	
				if(i!=j&&letter==(str.charAt(j)))
				{	
					
					isfound=true;
					break;
					
				}
			}
				if(isfound==false)
				{	
					System.out.println(letter);
					break;
				}
				
			
		}

	}

}

