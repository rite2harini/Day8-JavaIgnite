/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
package java_internship_assignment;

import java.util.Scanner;

public class Stringcompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(str);
		int isfound=1;
		
		for(int i=0;i<str.length();i++)
		{	
			if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
			{	
				isfound++;
			}
			else
			{	
				System.out.printf("%c%d",str.charAt(i),isfound);
				isfound=1;
			}
			
			
		}



	}

}
