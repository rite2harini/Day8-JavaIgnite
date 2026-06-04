/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
package java_internship_day9;
import java.util.Scanner;
public class Word_Reversal_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		System.out.println("Enter the string :");
		name = sc.nextLine();
		StringBuilder sb = new StringBuilder(name);
		String res="";
		String temp="";
		for(i=0;i<name.length();i++) {
			 if(name.charAt(i)==' ') {
			
				StringBuilder sb1 = new StringBuilder(temp);
				res = res + sb1.reverse();
			 }
			 else
				 temp=temp+name.charAt(i);
				 
		}
		 StringBuilder sb1 = new StringBuilder(temp);

	     res = res + sb.reverse();

	     System.out.println("Reversed Sentence : " + res);

	     sc.close();

	}

}
