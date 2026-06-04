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

public class Word_reversal {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String str = sc.nextLine();

        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {

                // Reverse current word
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }

                result += " ";
                word = "";
            }
        }

        // Reverse and add last word
        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
