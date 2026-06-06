/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
package java_internship_assignment;

import java.util.Scanner;

public class wordreversalsentence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the line");
		str=sc.nextLine();
		System.out.println(str);
		int i;
		String current="";
		String reverse="";
		
		for(i=0;i<str.length();i++)
		{	
			if(str.charAt(i)!=' ')
			{	
				current=current+str.charAt(i);
			}
			if(str.charAt(i)==' '||i==str.length()-1)
			{	
				StringBuilder sb=new StringBuilder(current);
				
				reverse=reverse+sb.reverse()+" ";
				
				current="";
				
			}
			
		}
		System.out.println(reverse);
		

	}

}
