/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
package day9_progs;

import java.util.Scanner;

public class String_compressor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String str = sc.nextLine();

		int count = 1;

		for(int i = 0; i < str.length(); i++) {

			if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {// i must be valid and we have to find the consecutive char 
				count++;
			}
			else {
				System.out.print(str.charAt(i) + "" + count);//other wise print it and its count and after count resets for next one
				count = 1;
			}
		}

		sc.close();
	}
}
