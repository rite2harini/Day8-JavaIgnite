/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
package day9_progs;

import java.util.Scanner;

public class word_traversal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence : ");
		String sentence = sc.nextLine();

		String words[] = sentence.split(" ");//where before space is

		for(int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder(words[i]);//we will separate that rev then without chageing their order
			System.out.print(sb.reverse() + " ");
		}

		sc.close();
	}
}
