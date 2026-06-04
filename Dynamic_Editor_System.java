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
package day9_progs;

import java.util.Scanner;

public class Dynamic_string_Builder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String → ");
		String word = sc.nextLine();

		StringBuilder str = new StringBuilder(word);

		System.out.print("Enter another word to add → ");
		String add = sc.nextLine();

		str.append(add);

		System.out.println("After Insert → " + str);

		System.out.print("Enter existing word to delete → ");
		String todelete = sc.nextLine();

		int index = str.indexOf(todelete); //the index from which to its end we want to delete

		if (index != -1) {
			str.delete(index, index + todelete.length());// index must not be invalid and the that word index its words end will be deleted
		}

		System.out.println("After Delete → " + str);

		// Replace Text
		System.out.print("Enter word to replace → ");
		String oldWord = sc.nextLine();// take the old one find its starting index

		System.out.print("Enter new word → ");
		String newWord = sc.nextLine();

		index = str.indexOf(oldWord);

		if (index != -1) {
			str.replace(index, index + oldWord.length(), newWord);// same index must not be invalid and from start index to its end we will do replacing
		}

		System.out.println("After Replace → " + str);

		// Reverse Text
		str.reverse();

		System.out.println("After Reverse → " + str);

		sc.close();
	}
}
