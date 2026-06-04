/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
public class WordReversal {
    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            result.append(reversedWord.reverse());
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
