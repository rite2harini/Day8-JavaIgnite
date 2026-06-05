/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */import java.util.Scanner;

public class WordReversalInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        String[] words = sentence.split(" ");

        System.out.print("Output: ");

        
        for (int i = 0; i < words.length; i++) {

            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse = reverse + words[i].charAt(j);
            }

            System.out.print(reverse + " ");
        }
    }
}
