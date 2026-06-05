/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());
            if(i < words.length - 1) result.append(" ");
        }
        
        System.out.println("Reversed words: " + result);
        sc.close();
    }
}
